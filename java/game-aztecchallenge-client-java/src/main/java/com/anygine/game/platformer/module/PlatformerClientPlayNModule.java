package com.anygine.game.platformer.module;

import playn.core.Assets;
import playn.core.PlayN;

import com.google.inject.AbstractModule;

public class PlatformerClientPlayNModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Assets.class).toInstance(PlayN.assets());
	}

}
