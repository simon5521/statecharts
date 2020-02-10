/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "InEventLifeCycle.h"

#include "sc_timer_service.h"

#define SC_UNUSED(P) (void)P

static InEventLifeCycle statechart;


class InEventLifeCycleTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void eventLifeCycle();
	void setTimer(InEventLifeCycle* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(InEventLifeCycle* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static InEventLifeCycleTest * tc;


void InEventLifeCycleTest::SetUp()
{
	inEventLifeCycle_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &inEventLifeCycle_runCycle,
		false,
		200,
		&statechart
	);
	
	
	tc = this;
}
void InEventLifeCycleTest::eventLifeCycle()
{
	inEventLifeCycle_enter(&statechart);
	inEventLifeCycleIface_raise_e(&statechart);
	EXPECT_TRUE(inEventLifeCycleIface_get_i(&statechart)== 0);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(inEventLifeCycleIface_get_i(&statechart)== 1);
}

void InEventLifeCycleTest::setTimer(InEventLifeCycle* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void InEventLifeCycleTest::unsetTimer(InEventLifeCycle* handle, const sc_eventid evid){
	SC_UNUSED(handle);
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(InEventLifeCycleTest, eventLifeCycle) {
	eventLifeCycle();
}


