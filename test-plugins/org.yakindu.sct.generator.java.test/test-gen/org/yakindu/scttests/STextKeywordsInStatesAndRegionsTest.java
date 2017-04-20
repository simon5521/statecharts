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
import org.yakindu.scr.stextkeywordsinstatesandregions.STextKeywordsInStatesAndRegionsStatemachine;
import org.yakindu.scr.stextkeywordsinstatesandregions.STextKeywordsInStatesAndRegionsStatemachine.State;

/**
 * Unit TestCase for STextKeywordsInStatesAndRegions
 */
@SuppressWarnings("all")
public class STextKeywordsInStatesAndRegionsTest {
	private STextKeywordsInStatesAndRegionsStatemachine statemachine;	
	
	@Before
	public void setUp() {
		statemachine = new STextKeywordsInStatesAndRegionsStatemachine();
		statemachine.init();
	}

	@After
	public void tearDown() {
		statemachine = null;
	}
	
	@Test
	public void testActiveCheckWithSTextNamedStates
	() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_interface));
		 
		assertTrue(statemachine.isStateActive(State.namespace_event));
		 
		assertTrue(statemachine.isStateActive(State.local_in));
		 
		assertTrue(statemachine.isStateActive(State.interface_var));
		 
		assertTrue(statemachine.isStateActive(State.internal_external));
		 
		assertTrue(statemachine.isStateActive(State.event_default));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_event));
		 
		assertTrue(statemachine.isStateActive(State.local_in));
		 
		assertTrue(statemachine.isStateActive(State.interface_var));
		 
		assertTrue(statemachine.isStateActive(State.internal_external));
		 
		assertTrue(statemachine.isStateActive(State.event_default));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_in));
		 
		assertTrue(statemachine.isStateActive(State.interface_var));
		 
		assertTrue(statemachine.isStateActive(State.internal_external));
		 
		assertTrue(statemachine.isStateActive(State.event_default));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_var));
		 
		assertTrue(statemachine.isStateActive(State.internal_external));
		 
		assertTrue(statemachine.isStateActive(State.event_default));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_external));
		 
		assertTrue(statemachine.isStateActive(State.event_default));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_default));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_entry));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_always));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_raise));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_active));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_interface));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_event));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_in));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_var));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_external));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_operation));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_default));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_operation));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_else));
		 
		assertTrue(statemachine.isStateActive(State.raise_entry));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_operation));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_else));
		 
		assertTrue(statemachine.isStateActive(State.raise_exit));
		 
		assertTrue(statemachine.isStateActive(State.valueof_always));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_operation));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_else));
		 
		assertTrue(statemachine.isStateActive(State.raise_exit));
		 
		assertTrue(statemachine.isStateActive(State.valueof_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.active_raise));
		 
		statemachine.raiseE1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_operation));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_else));
		 
		assertTrue(statemachine.isStateActive(State.raise_exit));
		 
		assertTrue(statemachine.isStateActive(State.valueof_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.active_valueof));
		 
		statemachine.raiseE2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.default_namespace));
		 
		assertTrue(statemachine.isStateActive(State.operation_internal));
		 
		assertTrue(statemachine.isStateActive(State.namespace_local));
		 
		assertTrue(statemachine.isStateActive(State.local_out));
		 
		assertTrue(statemachine.isStateActive(State.interface_readonly));
		 
		assertTrue(statemachine.isStateActive(State.internal_operation));
		 
		assertTrue(statemachine.isStateActive(State.event_else));
		 
		assertTrue(statemachine.isStateActive(State.in_exit));
		 
		assertTrue(statemachine.isStateActive(State.out_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.var_valueof));
		 
		assertTrue(statemachine.isStateActive(State.readonly_namespace));
		 
		assertTrue(statemachine.isStateActive(State.external_internal));
		 
		assertTrue(statemachine.isStateActive(State.else_local));
		 
		assertTrue(statemachine.isStateActive(State.entry_out));
		 
		assertTrue(statemachine.isStateActive(State.exit_readonly));
		 
		assertTrue(statemachine.isStateActive(State.always_operation));
		 
		assertTrue(statemachine.isStateActive(State.oncycle_else));
		 
		assertTrue(statemachine.isStateActive(State.raise_exit));
		 
		assertTrue(statemachine.isStateActive(State.valueof_oncycle));
		 
		assertTrue(statemachine.isStateActive(State.active_valueof));
		 
	}
}
