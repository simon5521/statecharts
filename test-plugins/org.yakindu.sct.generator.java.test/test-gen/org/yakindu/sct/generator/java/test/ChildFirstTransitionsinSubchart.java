
package org.yakindu.sct.generator.java.test;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.hamcrest.CoreMatchers.*;
import org.yakindu.scr.childfirsttransitionsinsubchart.IChildFirstTransitionsInSubchartStatemachine.*;	
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.childfirsttransitionsinsubchart.ChildFirstTransitionsInSubchartStatemachine;
import org.yakindu.scr.childfirsttransitionsinsubchart.ChildFirstTransitionsInSubchartStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for ChildFirstTransitionsInSubchart
 */
@SuppressWarnings("all")
public class ChildFirstTransitionsinSubchart {
	SCInterfaceOperationCallback defaultMock;
	
	private ChildFirstTransitionsInSubchartStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void childFirstTransitionsinSubchart_setUp() {
		statemachine = new ChildFirstTransitionsInSubchartStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		defaultMock = mock(SCInterfaceOperationCallback.class);
		statemachine.getSCInterface().setSCInterfaceOperationCallback(defaultMock);
		
		statemachine.init();
		
	}

	@After
	public void childFirstTransitionsinSubchart_tearDown() {
		statemachine.getSCInterface().setSCInterfaceOperationCallback(null);
		statemachine = null;
		
		timer = null;
	}
	
	public void set_up() {
		statemachine.getSCInterface().setCnt(0l);
	}
	
	public boolean checkA(boolean ret) {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		statemachine.getSCInterface().setA_check(statemachine.getCnt());
		return ret;
	}
	
	public boolean checkAA(boolean ret) {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		statemachine.getSCInterface().setAa_check(statemachine.getCnt());
		return ret;
	}
	
	public boolean checkAB(boolean ret) {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		statemachine.getSCInterface().setAb_check(statemachine.getCnt());
		return ret;
	}
	
	public boolean checkAC(boolean ret) {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		statemachine.getSCInterface().setAc_check(statemachine.getCnt());
		return ret;
	}
	
	public boolean checkAD(boolean ret) {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		statemachine.getSCInterface().setAd_check(statemachine.getCnt());
		return ret;
	}
	
	public boolean checkC(boolean ret) {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		statemachine.getSCInterface().setC_check(statemachine.getCnt());
		return ret;
	}
	
	public long nextCounter() {
		statemachine.getSCInterface().setCnt(statemachine.getCnt()+1l);
		return statemachine.getCnt();
	}
	
	@Test
	public void executionOrderWithNoTransitionInOrthogonalSubstates() {
		set_up();
		when(defaultMock.check("A")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkA(false);
			}
		});
		 
		when(defaultMock.check("AA")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAA(false);
			}
		});
		 
		when(defaultMock.check("AB")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAB(false);
			}
		});
		 
		when(defaultMock.check("AC")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAC(false);
			}
		});
		 
		when(defaultMock.check("AD")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAD(false);
			}
		});
		 
		when(defaultMock.check("C")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkC(false);
			}
		});
		 
		when(defaultMock.next()).thenAnswer(new Answer<Long>() {
			@Override
			public Long answer(InvocationOnMock invocation) {
				return nextCounter();
			}
		});
		 
		statemachine.enter();
		timer.cycleLeap(1);
		assertTrue(statemachine.getAa_check() == 1l);
		assertTrue(statemachine.getAa_local() == 2l);
		assertTrue(statemachine.getAc_check() == 3l);
		assertTrue(statemachine.getAc_local() == 4l);
		assertTrue(statemachine.getA_check() == 5l);
		assertTrue(statemachine.getA_local() == 6l);
		assertTrue(statemachine.getC_check() == 7l);
		assertTrue(statemachine.getC_local() == 8l);
		assertTrue(statemachine.getSm_local() == 9l);
	}
	
	@Test
	public void executionOrderWithTransitionInFirstSubRegion() {
		set_up();
		when(defaultMock.check("A")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkA(false);
			}
		});
		 
		when(defaultMock.check("AA")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAA(true);
			}
		});
		 
		when(defaultMock.check("AB")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAB(false);
			}
		});
		 
		when(defaultMock.check("AC")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAC(false);
			}
		});
		 
		when(defaultMock.check("AD")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAD(false);
			}
		});
		 
		when(defaultMock.check("C")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkC(false);
			}
		});
		 
		when(defaultMock.next()).thenAnswer(new Answer<Long>() {
			@Override
			public Long answer(InvocationOnMock invocation) {
				return nextCounter();
			}
		});
		 
		statemachine.enter();
		timer.cycleLeap(1);
		assertTrue(statemachine.getAa_check() == 1l);
		assertTrue(statemachine.getAa_local() == 0l);
		assertTrue(statemachine.getAc_check() == 2l);
		assertTrue(statemachine.getAc_local() == 3l);
		assertTrue(statemachine.getA_check() == 4l);
		assertTrue(statemachine.getA_local() == 5l);
		assertTrue(statemachine.getC_check() == 6l);
		assertTrue(statemachine.getC_local() == 7l);
		assertTrue(statemachine.getSm_local() == 8l);
	}
	
	@Test
	public void executionOrderWithTransitionInLastSubRegion() {
		set_up();
		when(defaultMock.check("A")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkA(false);
			}
		});
		 
		when(defaultMock.check("AA")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAA(false);
			}
		});
		 
		when(defaultMock.check("AB")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAB(false);
			}
		});
		 
		when(defaultMock.check("AC")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAC(true);
			}
		});
		 
		when(defaultMock.check("AD")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAD(false);
			}
		});
		 
		when(defaultMock.check("C")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkC(false);
			}
		});
		 
		when(defaultMock.next()).thenAnswer(new Answer<Long>() {
			@Override
			public Long answer(InvocationOnMock invocation) {
				return nextCounter();
			}
		});
		 
		statemachine.enter();
		timer.cycleLeap(1);
		assertTrue(statemachine.getAa_check() == 1l);
		assertTrue(statemachine.getAa_local() == 2l);
		assertTrue(statemachine.getAc_check() == 3l);
		assertTrue(statemachine.getAc_local() == 0l);
		assertTrue(statemachine.getA_check() == 0l);
		assertTrue(statemachine.getA_local() == 4l);
		assertTrue(statemachine.getC_check() == 5l);
		assertTrue(statemachine.getC_local() == 6l);
		assertTrue(statemachine.getSm_local() == 7l);
	}
	
	@Test
	public void executionOrderWithTransitionInAllSubRegion() {
		set_up();
		when(defaultMock.check("A")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkA(false);
			}
		});
		 
		when(defaultMock.check("AA")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAA(true);
			}
		});
		 
		when(defaultMock.check("AB")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAB(false);
			}
		});
		 
		when(defaultMock.check("AC")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAC(true);
			}
		});
		 
		when(defaultMock.check("AD")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkAD(false);
			}
		});
		 
		when(defaultMock.check("C")).thenAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) {
				return checkC(false);
			}
		});
		 
		when(defaultMock.next()).thenAnswer(new Answer<Long>() {
			@Override
			public Long answer(InvocationOnMock invocation) {
				return nextCounter();
			}
		});
		 
		statemachine.enter();
		timer.cycleLeap(1);
		assertTrue(statemachine.getAa_check() == 1l);
		assertTrue(statemachine.getAa_local() == 0l);
		assertTrue(statemachine.getA_local() == 3l);
		assertTrue(statemachine.getAc_check() == 2l);
		assertTrue(statemachine.getAc_local() == 0l);
		assertTrue(statemachine.getA_check() == 0l);
		assertTrue(statemachine.getA_local() == 3l);
		assertTrue(statemachine.getC_check() == 4l);
		assertTrue(statemachine.getC_local() == 5l);
		assertTrue(statemachine.getSm_local() == 6l);
	}
}
