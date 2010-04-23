package org.jboss.weld.examples.translator;

import javax.enterprise.event.Observes;
import javax.inject.Inject;



public class MyObserverBean {
	
	@Inject
	CodeEAO codeEAO;
			
	public void onAnyDocumentEvent(@Observes Document document) { 
		System.out.println("observing event now!");
		Code code = new Code();
		codeEAO.addCode(code, true);
	}
	
	public void afterDocumentUpdate(@Observes @Updated Document document) { 
		System.out.println("afterDocumentUpdate event now!");
	}
}
