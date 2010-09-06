/*
* generated by Xtext
*/
package org.xtext.workshop.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.xtext.workshop.webGui.DataType;
import org.xtext.workshop.webGui.DomainModel;
import org.xtext.workshop.webGui.Entity;
import org.xtext.workshop.webGui.Feature;
import org.xtext.workshop.webGui.Model;
import org.xtext.workshop.webGui.Page;
import org.xtext.workshop.webGui.PageElement;
import org.xtext.workshop.webGui.SingleElement;
import org.xtext.workshop.webGui.WebModel;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 * 
 * Icons are from: http://openiconlibrary.sourceforge.net
 */
public class WebGuiLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public WebGuiLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/

    String image(Model ele) {
        return "globe.png";
      }
	
    String image(DomainModel ele) {
        return "folder-documents.png";
      }
    
    String image(Entity ele) {
        return "blockdevice.png";
      }

    String image(DataType ele) {
        return "database.png";
      }

    String image(Feature ele) {
        return "arrow-right-3.png";
      }
    
    
    String image(WebModel ele) {
        return "folder-html.png";
      }
    
    String image(Page ele) {
        return "www.png";
      }

    String image(PageElement ele) {
        return "arrow-right-2.png";
      }
    
}
