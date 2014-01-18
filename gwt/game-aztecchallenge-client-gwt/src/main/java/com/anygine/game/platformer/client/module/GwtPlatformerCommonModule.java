package com.anygine.game.platformer.client.module;

import com.anygine.core.common.client.Simulation;
import com.anygine.core.common.client.domain.GameComponentFactory;
import com.anygine.core.common.client.domain.Player;
import com.anygine.game.platformer.common.client.core.PlatformerGameComponentFactory;
import com.anygine.game.platformer.common.client.core.PlatformerPlayerImpl;
import com.anygine.game.platformer.common.client.core.PlatformerSimulation;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class GwtPlatformerCommonModule extends AbstractGinModule {

	@Override
	protected void configure() {

		bind(PlatformerSimulation.class).in(Singleton.class);
		bind(PlatformerGameComponentFactory.class).in(Singleton.class);
		bind(PlatformerPlayerImpl.class).in(Singleton.class);

		bind(Simulation.class).to(PlatformerSimulation.class);
		bind(GameComponentFactory.class).to(PlatformerGameComponentFactory.class);
		bind(Player.class).to(PlatformerPlayerImpl.class);
	}

}
