package com.builder.application.stc;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Group;

/**
 * 
 * @author Gallo
 * This class makes up the group of the screentemplatearea and screen selector.
 *
 */
public class ScreenTemplateController extends Group{
	
	private ScreenTemplateArea screenTempArea;
	private ScreenTemplateSelector screenTempSelector;
	
	/**
	 * ScreenTemplateController constuctor
	 */
	public ScreenTemplateController() {
		this(null);
	}
	
	public ScreenTemplateController(List<ScreenTemplate> screenTemplateList){
		init();
		screenTempArea = new ScreenTemplateArea(screenTemplateList);
		screenTempSelector = new ScreenTemplateSelector(screenTemplateList);
		this.addActor(screenTempArea);
		this.addActor(screenTempSelector);
	}

	/**
	 * group settings
	 */
	private void init() {
		this.setSize(Gdx.graphics.getWidth()/3, Gdx.graphics.getHeight());
		this.setPosition(0, 0);
	}
	

}
