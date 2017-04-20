/**
* Copyright (c) 2017 committers of YAKINDU and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     committers of YAKINDU - initial API and implementation
*/

package org.yakindu.scttests;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.finalstate.FinalStateStatemachine;
import org.yakindu.scr.finalstate.FinalStateStatemachine.State;

/**
 * Unit TestCase for FinalState
 */
@SuppressWarnings("all")
public class FinalStateTest {
	private FinalStateStatemachine statemachine;	
	
	@Before
	public void setUp() {
		statemachine = new FinalStateStatemachine();
		statemachine.init();
	}

	@After
	public void tearDown() {
		statemachine = null;
	}
	
	@Test
	public void testStatechartNameTest
	() {
		statemachine.enter();
		statemachine.runCycle();
		assertTrue(statemachine.isFinal());
		 
	}
}
