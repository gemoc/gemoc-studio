/*
* generated by Xtext
*/
package org.gemoc.gexpressions.xtext.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider

//import org.eclipse.xtext.resource.IEObjectDescription
/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class GExpressionsDescriptionLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider{

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

// Labels and icons can be computed like this:
//	override text(IEObjectDescription ele) {
//		ele.name.toString
//	}
//	 
//	override image(IEObjectDescription ele) {
//		ele.EClass.name + '.gif'
//	}	 
}