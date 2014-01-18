package com.anygine.game.platformer.client;

import playn.core.Game;
import playn.core.PlayN;
import playn.html.HtmlAssets;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.anygine.core.common.client.inject.GameplayCommonInjectorManager;
import com.anygine.game.client.GameplayClientInjectorManager;
import com.anygine.game.platformer.client.module.GwtPlatformerInjector;
import com.google.gwt.core.client.GWT;

public class PlatformerHtml extends HtmlGame {

	@Override
	public void start() {
		
		HtmlAssets assets = HtmlPlatform.register().assets();
		assets.setPathPrefix("platformer/");

		GwtPlatformerInjector gwtPlatformerInjector = 
			GWT.create(GwtPlatformerInjector.class);
		GameplayCommonInjectorManager.setInjector(gwtPlatformerInjector);
		GameplayClientInjectorManager.setInjector(gwtPlatformerInjector);
	
		Game game = GameplayClientInjectorManager.getInjector().getGame();
		PlayN.run(game);
	}
}
