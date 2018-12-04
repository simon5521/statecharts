
package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.bitexpressions.BitExpressionsStatemachine;
import org.yakindu.scr.bitexpressions.BitExpressionsStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for BitExpressions
 */
@SuppressWarnings("all")
public class BitExpressions {
	
	private BitExpressionsStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void bitExpressions_setUp() {
		statemachine = new BitExpressionsStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void bitExpressions_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void bitExpressions() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_StateA));
		assertTrue(statemachine.getMyBit1() == 5l);
		assertTrue(statemachine.getMyBit2() == 7l);
		statemachine.getSCInterface().raiseE1();
		timer.cycleLeap(1);
		assertTrue(statemachine.isStateActive(State.main_region_StateB));
		assertTrue(statemachine.getLeftBitshift() == 10l);
		assertTrue(statemachine.getRightBitshift() == 2l);
		assertTrue(statemachine.getComplementBitshift() == - 6l );
		assertTrue(statemachine.getBitwiseAnd() == 5l);
		assertTrue(statemachine.getBitwiseOr() == 7l);
		assertTrue(statemachine.getBitwiseXor() == 2l);
	}
}
