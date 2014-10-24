package com.builder.application.clc;

import com.badlogic.gdx.scenes.scene2d.Group;

/**
 * 
 * @author Gallo
 *
 */
public class ComponentLayoutController extends Group{
	
	private ComponentGroup componentGroup;
	
	public ComponentLayoutController(ComponentGroup componentGroup) {
		this.componentGroup = componentGroup;
		populateItems();
	}

	private void populateItems() {
		for(ComponentItem item : componentGroup.getComponents()){
			this.addActor(item.getSelectionActor());
			// may need to add to a table layout or some sort of scrollview
		}
		
	}

}
