package com.builder;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.builder.application.stc.ScreenTemplateController;

public class BuildingApplication implements ApplicationListener {
	private Stage applicationStage;
	private ScreenTemplateController screenTempController;

	
	@Override
	public void create() {	
		applicationStage = new Stage();
		initScreen();
	}

	private void initScreen() {
		screenTempController = new ScreenTemplateController();
		// other 2 sections
		applicationStage.addActor(screenTempController);
	}

	@Override
	public void dispose() {
		applicationStage.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		applicationStage.act();
		applicationStage.draw();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
