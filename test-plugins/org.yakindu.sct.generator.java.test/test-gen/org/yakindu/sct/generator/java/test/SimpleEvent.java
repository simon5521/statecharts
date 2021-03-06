/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.simpleevent.SimpleEventStatemachine;
import org.yakindu.scr.simpleevent.SimpleEventStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for SimpleEvent
 */
@SuppressWarnings("all")
public class SimpleEvent {
	
	private SimpleEventStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void simpleEvent_setUp() {
		statemachine = new SimpleEventStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void simpleEvent_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void simpleEventTest() {
		statemachine.enter();
		assertTrue("Expected A to be active",statemachine.isStateActive(State.main_region_A));
		assertTrue(5l == 5l);
		statemachine.raiseEvent1();
		timer.cycleLeap(1l);
		assertTrue("Expected B to be active",statemachine.isStateActive(State.main_region_B));
		timer.cycleLeap(1l);
		assertTrue(!statemachine.isStateActive(State.main_region_B));
	}
}
