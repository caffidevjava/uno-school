package com.caffidev.unoone;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.logging.LogManager;

public class Game extends ApplicationAdapter {
	// We don't need to write our own logger
	public static final Logger logger = new Logger("Uno-one");
	protected Framerate framerate;
	
	@Override
	public void create(){
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		//todo: pick a color
		framerate = new Framerate();
		logger.setLevel(Logger.DEBUG);
		logger.debug("Logging started.");
		
		Player player = new Player("Kesha");
		logger.debug(player.getUuid().toString());
	}
	
	@Override
	public void resize(int width, int height){ 
		framerate.resize(width, height);
	}
	
	@Override
	public void render() {
		// Clean screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		framerate.renderWithUpdate();
	}
	
	@Override
	public void pause() { }
	
	@Override
	public void resume() { }
	
	@Override
	public void dispose() {
		framerate.dispose();
	}
}
