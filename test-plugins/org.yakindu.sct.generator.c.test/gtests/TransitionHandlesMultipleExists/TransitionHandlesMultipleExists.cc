/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "TransitionHandlesMultipleExits.h"

#include "sc_timer_service.h"

#define SC_UNUSED(P) (void)P

static TransitionHandlesMultipleExits statechart;


class TransitionHandlesMultipleExists : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void testTransitionHandling2Of2Exits();
	void testTransitionHandling2Of3Exits();
	void testTransitionHandling1Of3Exits();
	void setTimer(TransitionHandlesMultipleExits* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(TransitionHandlesMultipleExits* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static TransitionHandlesMultipleExists * tc;


void TransitionHandlesMultipleExists::SetUp()
{
	transitionHandlesMultipleExits_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &transitionHandlesMultipleExits_runCycle,
		true,
		200,
		&statechart
	);
	
	
	tc = this;
}
void TransitionHandlesMultipleExists::testTransitionHandling2Of2Exits()
{
	transitionHandlesMultipleExits_enter(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_A_r_AA));
	transitionHandlesMultipleExitsIface_raise_e(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_B_r_BB));
	EXPECT_TRUE(transitionHandlesMultipleExitsIface_get_x(&statechart)== 1);
	transitionHandlesMultipleExits_exit(&statechart);
	transitionHandlesMultipleExits_enter(&statechart);
	transitionHandlesMultipleExitsIface_set_x(&statechart,0);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_A_r_AA));
	transitionHandlesMultipleExitsIface_raise_f(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_B_r_BB));
	EXPECT_TRUE(transitionHandlesMultipleExitsIface_get_x(&statechart)== 2);
}
void TransitionHandlesMultipleExists::testTransitionHandling2Of3Exits()
{
	transitionHandlesMultipleExits_enter(&statechart);
	transitionHandlesMultipleExitsIface_raise_e(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_B_r_BB));
	transitionHandlesMultipleExitsIface_set_x(&statechart,0);
	transitionHandlesMultipleExitsIface_raise_e(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_A_r_AA));
	EXPECT_TRUE(transitionHandlesMultipleExitsIface_get_x(&statechart)== 11);
	transitionHandlesMultipleExitsIface_raise_e(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_B_r_BB));
	transitionHandlesMultipleExitsIface_set_x(&statechart,0);
	transitionHandlesMultipleExitsIface_raise_g(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_A_r_AA));
	EXPECT_TRUE(transitionHandlesMultipleExitsIface_get_x(&statechart)== 10);
	transitionHandlesMultipleExits_exit(&statechart);
}
void TransitionHandlesMultipleExists::testTransitionHandling1Of3Exits()
{
	transitionHandlesMultipleExits_enter(&statechart);
	transitionHandlesMultipleExitsIface_raise_e(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_B_r_BB));
	transitionHandlesMultipleExitsIface_set_x(&statechart,0);
	transitionHandlesMultipleExitsIface_raise_f(&statechart);
	EXPECT_TRUE(transitionHandlesMultipleExits_isStateActive(&statechart, TransitionHandlesMultipleExits_TransitionHandlesMultipleExits_main_region_A_r_AA));
	EXPECT_TRUE(transitionHandlesMultipleExitsIface_get_x(&statechart)== 24);
	transitionHandlesMultipleExits_exit(&statechart);
}

void TransitionHandlesMultipleExists::setTimer(TransitionHandlesMultipleExits* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void TransitionHandlesMultipleExists::unsetTimer(TransitionHandlesMultipleExits* handle, const sc_eventid evid){
	SC_UNUSED(handle);
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(TransitionHandlesMultipleExists, testTransitionHandling2Of2Exits) {
	testTransitionHandling2Of2Exits();
}
TEST_F(TransitionHandlesMultipleExists, testTransitionHandling2Of3Exits) {
	testTransitionHandling2Of3Exits();
}
TEST_F(TransitionHandlesMultipleExists, testTransitionHandling1Of3Exits) {
	testTransitionHandling1Of3Exits();
}


