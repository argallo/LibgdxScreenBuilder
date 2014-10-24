package com.builder.application.ac;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.builder.application.clc.ComponentItem;

/**
 * 
 * @author Gallo
 *
 */
public class AdjustmentsController extends Group{
	
	private ComponentLayerManager CLM;
	
	/**
	 * creates a default adjustments controller
	 */
	public AdjustmentsController() {
		this(null, null);
	}
	
	/**
	 * 
	 * @param attr the current attributes options
	 * @param componentItems the list of component layers
	 */
	public AdjustmentsController(Attributes attr, List<ComponentItem> componentItems) {
		if(attr == null){
			this.addActor(new EmptyAttr());
		}
		else{
			this.addActor(attr);
		}
		
		if(componentItems != null){
			CLM = new ComponentLayerManager(componentItems);
			//might change list to a class to allow for selection of the items unless the component item class will do a lot of things
		}
		else{
			CLM = new ComponentLayerManager(new ArrayList<ComponentItem>());
		}
		this.addActor(CLM);
	}
	
	
	

}
