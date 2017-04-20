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
import org.yakindu.scr.shallowhistorywithdeepentry.ShallowHistoryWithDeepEntryStatemachine;
import org.yakindu.scr.shallowhistorywithdeepentry.ShallowHistoryWithDeepEntryStatemachine.State;

/**
 * Unit TestCase for ShallowHistoryWithDeepEntry
 */
@SuppressWarnings("all")
public class ShallowHistoryWithDeepEntryTest {
	private ShallowHistoryWithDeepEntryStatemachine statemachine;	
	
	@Before
	public void setUp() {
		statemachine = new ShallowHistoryWithDeepEntryStatemachine();
		statemachine.init();
	}

	@After
	public void tearDown() {
		statemachine = null;
	}
	
	@Test
	public void testNoDeepEntryWithinHistory
	() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_Y));
		 
		statemachine.raiseToZ();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_A));
		 
		statemachine.raiseToY();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Y));
		 
		statemachine.raiseToZ();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_A));
		 
	}
	@Test
	public void testDeepEntryWithinHistory
	() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_Y));
		 
		statemachine.raiseToZ();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_A));
		 
		statemachine.raiseToC();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B__region0_C));
		 
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B));
		 
		statemachine.raiseToY();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Y));
		 
		statemachine.raiseToZ();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B__region0_C));
		 
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B));
		 
	}
	@Test
	public void testDirectDeepEntryIntoHistory
	() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_Y));
		 
		statemachine.raiseToC();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B__region0_C));
		 
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B));
		 
		statemachine.raiseToY();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Y));
		 
		statemachine.raiseToZ();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B__region0_C));
		 
		assertTrue(statemachine.isStateActive(State.main_region_Z__region0_B));
		 
	}
}
