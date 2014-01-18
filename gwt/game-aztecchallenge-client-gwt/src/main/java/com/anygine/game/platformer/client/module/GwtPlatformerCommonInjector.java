package com.anygine.game.platformer.client.module;

import com.anygine.core.common.client.inject.GameplayCommonInjector;
import com.anygine.game.platformer.common.client.core.PlatformerGameComponentFactory;
import com.anygine.game.platformer.common.client.core.PlatformerPlayerImpl;
import com.anygine.game.platformer.common.client.core.PlatformerSimulation;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(GwtPlatformerCommonModule.class)
public interface GwtPlatformerCommonInjector extends Ginjector, GameplayCommonInjector {
	PlatformerSimulation getSimulation();
	PlatformerGameComponentFactory getGameComponentFactory();
	PlatformerPlayerImpl getPlayer();
}
