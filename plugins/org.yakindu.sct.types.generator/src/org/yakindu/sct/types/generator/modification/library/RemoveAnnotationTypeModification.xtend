package org.yakindu.sct.types.generator.modification.library

import java.util.Collection
import org.eclipse.emf.ecore.util.EcoreUtil
import org.yakindu.base.types.AnnotationType
import org.yakindu.base.types.Package
import org.yakindu.sct.types.modification.IModification

class RemoveAnnotationTypeModification implements IModification{
	
	override modify(Collection<Package> packages) {
		packages.forEach[modify]
		packages
	}

	def modify(Package it) {
		eAllContents.filter(AnnotationType).toList.forEach[ at |
			EcoreUtil.remove(at)
		]
		it
	}
	
}
