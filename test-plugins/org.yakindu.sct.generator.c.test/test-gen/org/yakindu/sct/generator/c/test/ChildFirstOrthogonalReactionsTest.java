/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.generator.c.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestRunner;
import org.yakindu.sct.generator.c.gtest.GTestHelper;

@GTest(
	statechartBundle = "org.yakindu.sct.test.models",
	sourceFile = "gtests/ChildFirstOrthogonalReactions/ChildFirstOrthogonalReactionsTest.cc",
	program = "gtests/ChildFirstOrthogonalReactions/ChildFirstOrthogonalReactions",
	model = "testmodels/SCTUnit/executionorder/ChildFirstOrthogonalReactions.sct",
	additionalFilesToCopy = {
		"libraryTarget/sc_timer_service.c",
		"libraryTarget/sc_timer_service.h"
	},
	additionalFilesToCompile = {
		"ChildFirstOrthogonalReactions.c",
		"sc_timer_service.c"
	}
)
@RunWith(GTestRunner.class)
public class ChildFirstOrthogonalReactionsTest {

	protected final GTestHelper helper = new GTestHelper(this);

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}
}
