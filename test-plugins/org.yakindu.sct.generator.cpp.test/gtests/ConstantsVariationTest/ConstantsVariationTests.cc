/** Generated by YAKINDU Statechart Tools code generator. */
#include <string>
#include "gtest/gtest.h"
#include "ConstantsVariation.h"
#include "sc_runner.h"
#include "sc_types.h"

namespace  {

ConstantsVariation* statechart;



//! The timers are managed by a timer service. */
static SctUnitRunner * runner;

class ConstantsVariationTests : public ::testing::Test{
	protected:
	virtual void SetUp() {
		statechart = new ConstantsVariation();
		statechart->init();
		runner = new SctUnitRunner(
			statechart,
			false,
			200
		);
	}
	virtual void TearDown() {
		delete statechart;
		delete runner;
	}
};


TEST_F(ConstantsVariationTests, constantDefinition) {
	
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(ConstantsVariation::main_region_StateA));
	
	EXPECT_TRUE(statechart->get_b2()== true);
	
	EXPECT_TRUE(statechart->getSCI_Named()->get_b()== true);
	
	EXPECT_TRUE(statechart->get_i2()== 5);
	
	EXPECT_TRUE(statechart->getSCI_Named()->get_i()== 5);
	
	EXPECT_TRUE(statechart->get_r2()== 5);
	
	EXPECT_TRUE(statechart->getSCI_Named()->get_r()== 5);
	
	EXPECT_TRUE(strcmp(statechart->get_str2(), (sc_string)"String") == 0);
	
	EXPECT_TRUE(strcmp(statechart->getSCI_Named()->get_str(), (sc_string)"String") == 0);
	
	runner->proceed_cycles(1);
	
	EXPECT_TRUE(statechart->isFinal());
	
	
}

}

