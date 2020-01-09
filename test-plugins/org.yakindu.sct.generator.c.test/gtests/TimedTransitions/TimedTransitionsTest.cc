/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "TimedTransitions.h"

#include "TimedTransitionsRequired.h"
#include "sc_timer_service.h"

static TimedTransitions statechart;


class TimedTransitionsTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void Timer01();
	void Timer02();
	void noAdditionalCycle();
	void countCycles();
	void setTimer(TimedTransitions* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(TimedTransitions* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static TimedTransitionsTest * tc;


void TimedTransitionsTest::SetUp()
{
	timedTransitions_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		(sc_raise_time_event_fp) &timedTransitions_raiseTimeEvent,
		(sc_run_cycle_fp) &timedTransitions_runCycle,
		false,
		200,
		&statechart
	);
	
	
	tc = this;
}
void TimedTransitionsTest::Timer01()
{
	timedTransitions_enter(&statechart);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_Start));
	sc_timer_service_proceed_time(&timer_service, 2030);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_End));
}
void TimedTransitionsTest::Timer02()
{
	timedTransitions_enter(&statechart);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_Start));
	sc_timer_service_proceed_time(&timer_service, 2*1000);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_End));
}
void TimedTransitionsTest::noAdditionalCycle()
{
	timedTransitions_enter(&statechart);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_Start));
	sc_timer_service_proceed_time(&timer_service, 1950);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_Start));
	sc_timer_service_proceed_time(&timer_service, 100);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_End));
}
void TimedTransitionsTest::countCycles()
{
	timedTransitions_enter(&statechart);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_Start));
	EXPECT_TRUE((timedTransitionsIface_get_cycles(&statechart)== 0));
	EXPECT_TRUE((timedTransitionsIface_get_seconds(&statechart)== 0));
	sc_timer_service_proceed_time(&timer_service, 100);
	EXPECT_TRUE((timedTransitionsIface_get_cycles(&statechart)== 0));
	EXPECT_TRUE((timedTransitionsIface_get_seconds(&statechart)== 0));
	sc_timer_service_proceed_time(&timer_service, 100);
	EXPECT_TRUE((timedTransitionsIface_get_cycles(&statechart)== 1));
	EXPECT_TRUE((timedTransitionsIface_get_seconds(&statechart)== 0));
	sc_timer_service_proceed_time(&timer_service, 800);
	EXPECT_TRUE((timedTransitionsIface_get_cycles(&statechart)== 5));
	EXPECT_TRUE((timedTransitionsIface_get_seconds(&statechart)== 1));
}

void TimedTransitionsTest::setTimer(TimedTransitions* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void TimedTransitionsTest::unsetTimer(TimedTransitions* handle, const sc_eventid evid){
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(TimedTransitionsTest, Timer01) {
	Timer01();
}
TEST_F(TimedTransitionsTest, Timer02) {
	Timer02();
}
TEST_F(TimedTransitionsTest, noAdditionalCycle) {
	noAdditionalCycle();
}
TEST_F(TimedTransitionsTest, countCycles) {
	countCycles();
}

void timedTransitions_setTimer(TimedTransitions* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	tc->setTimer(statechart, evid, time_ms, periodic);
}

void timedTransitions_unsetTimer(TimedTransitions* handle, const sc_eventid evid){
	tc->unsetTimer(handle, evid);
}

