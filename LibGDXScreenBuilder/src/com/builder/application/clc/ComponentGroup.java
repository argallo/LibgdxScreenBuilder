package com.builder.application.clc;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gallo
 *
 */
public class ComponentGroup {

	List<ComponentItem> components;
	
	/**
	 * default constructor creates default component list
	 */
	public ComponentGroup() {
		this(null);
	}

	/**
	 * 
	 * @param components a list of components to populate instead of defaults
	 */
	public ComponentGroup(List<ComponentItem> components) {
		if(components != null){
			this.components = components;
		}
		else{
			generateDefaultList();
		}
	}

	/**
	 * generates the defaults list
	 */
	private void generateDefaultList() {
		components = new ArrayList<ComponentItem>();
		//generate list
	}
	
	public List<ComponentItem> getComponents() {
		return components;
	}
	
	
	
}
