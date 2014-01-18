package com.anygine.game.platformer.client.module;

import CollectableRenderer;
import playn.core.Game;

import com.anygine.core.client.client.GameClient;
import com.anygine.core.client.client.render.EnemyRenderer;
import com.anygine.core.client.client.render.ExitRenderer;
import com.anygine.core.client.client.render.LevelRenderer;
import com.anygine.core.client.client.render.PlayerRenderer;
import com.anygine.core.client.client.render.SearchableRenderer;
import com.anygine.core.client.client.render.SimulationRenderer;
import com.anygine.core.common.client.Simulation;
import com.anygine.core.common.client.domain.GameComponentFactory;
import com.anygine.core.common.client.domain.Player;
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
import com.anygine.game.platformer.common.client.core.PlatformerGameComponentFactory;
import com.anygine.game.platformer.common.client.core.PlatformerPlayerImpl;
import com.anygine.game.platformer.common.client.core.PlatformerSimulation;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class GwtPlatformerModule extends AbstractGinModule {

	@Override
	protected void configure() {
		
		bind(PlatformerSimulation.class).in(Singleton.class);
		bind(PlatformerGameComponentFactory.class).in(Singleton.class);
		bind(PlatformerPlayerImpl.class).in(Singleton.class);

		bind(PlatformerScreenManager.class).in(Singleton.class);
		bind(GameClient.class).in(Singleton.class);
		bind(PlayerInputReader.class).in(Singleton.class);
		bind(PlatformerRenderer.class).in(Singleton.class);

		bind(PlatformerLevelRenderer.class).in(Singleton.class);
		bind(PlatformerEnemyRenderer.class).in(Singleton.class);
		bind(PlatformerCollectableRenderer.class).in(Singleton.class);
		bind(PlatformerSearchableRenderer.class).in(Singleton.class);
		bind(PlatformerPlayerRenderer.class).in(Singleton.class);
		bind(PlatformerExitRenderer.class).in(Singleton.class);
		
		bind(Simulation.class).to(PlatformerSimulation.class);
		bind(GameComponentFactory.class).to(PlatformerGameComponentFactory.class);
		bind(Player.class).to(PlatformerPlayerImpl.class);
		
		bind(ScreenManager.class).to(PlatformerScreenManager.class);
		bind(Game.class).to(GameClient.class);
		bind(InputReader.class).to(PlayerInputReader.class);
		bind(SimulationRenderer.class).to(PlatformerRenderer.class);

		bind(LevelRenderer.class).to(PlatformerLevelRenderer.class);
		bind(EnemyRenderer.class).to(PlatformerEnemyRenderer.class);
		bind(CollectableRenderer.class).to(PlatformerCollectableRenderer.class);
		bind(SearchableRenderer.class).to(PlatformerSearchableRenderer.class);
		bind(PlayerRenderer.class).to(PlatformerPlayerRenderer.class);
		bind(ExitRenderer.class).to(PlatformerExitRenderer.class);
	}

}
