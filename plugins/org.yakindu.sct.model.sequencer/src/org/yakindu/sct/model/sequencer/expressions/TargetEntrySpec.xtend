/** 
 * Copyright (c) 2019 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.sct.model.sequencer.expressions

import org.eclipse.xtend.lib.annotations.Data
import org.yakindu.sct.model.sgraph.Vertex

@Data class TargetEntrySpec {
	
	Vertex target
	String entryPointName
	
}
