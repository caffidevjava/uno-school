package com.caffidev.unoone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Game extends ApplicationAdapter {
	protected Framerate framerate;
	@Override
	public void create(){ 
		framerate = new Framerate();
	}
	
	@Override
	public void resize(int width, int height){ 
		
	}
	
	@Override
	public void render() { 
		framerate.renderWithUpdate();
	}
	
	@Override
	public void pause() { }
	
	@Override
	public void resume() { }
	
	@Override
	public void dispose() { }
}
