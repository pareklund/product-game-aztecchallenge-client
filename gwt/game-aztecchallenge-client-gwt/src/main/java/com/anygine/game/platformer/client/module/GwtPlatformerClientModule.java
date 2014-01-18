package com.anygine.game.platformer.client.module;

import playn.core.Game;

import com.anygine.core.client.client.GameClient;
import com.anygine.core.client.client.render.SimulationRenderer;
import com.anygine.core.common.client.input.InputReader;
import com.anygine.core.common.client.input.PlayerInputReader;
import com.anygine.game.client.screen.ScreenManager;
import com.anygine.game.platformer.client.PlatformerCollectableRenderer;
import com.anygine.game.platformer.client.PlatformerEnemyRenderer;
import com.anygine.game.platformer.client.PlatformerExitRenderer;
import com.anygine.game.platformer.client.PlatformerPlayerRenderer;
import com.anygine.game.platformer.client.PlatformerSearchableRenderer;
import com.anygine.game.platformer.client.core.PlatformerLevelRenderer;
import com.anygine.game.platformer.client.core.PlatformerRenderer;
import com.anygine.game.platformer.client.screen.PlatformerScreenManager;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class GwtPlatformerClientModule extends AbstractGinModule {

	@Override
	protected void configure() {
		
		bind(PlatformerScreenManager.class).in(Singleton.class);
		bind(GameClient.class).in(Singleton.class);
		bind(PlayerInputReader.class).in(Singleton.class);
		bind(PlatformerRenderer.class).in(Singleton.class);
		
		bind(ScreenManager.class).to(PlatformerScreenManager.class);
		bind(Game.class).to(GameClient.class);
		bind(InputReader.class).to(PlayerInputReader.class);
		bind(SimulationRenderer.class).to(PlatformerRenderer.class);

		bind(PlatformerLevelRenderer.class).in(Singleton.class);
		bind(PlatformerEnemyRenderer.class).in(Singleton.class);
		bind(PlatformerCollectableRenderer.class).in(Singleton.class);
		bind(PlatformerSearchableRenderer.class).in(Singleton.class);
		bind(PlatformerPlayerRenderer.class).in(Singleton.class);
		bind(PlatformerExitRenderer.class).in(Singleton.class);
	}

}
