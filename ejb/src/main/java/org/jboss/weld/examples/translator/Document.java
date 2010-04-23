package org.jboss.weld.examples.translator;

import java.io.Serializable;

import javax.inject.Named;

@Named("document")
public class Document implements Serializable {
		
	private static final long serialVersionUID = -923116208546353275L;
	private String name = "myDoc1";
	private String id = "1234";
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
