package com.anygine.game.platformer.client.module;

import com.anygine.core.client.client.GameClient;
import com.anygine.core.common.client.inject.GameplayCommonInjector;
import com.anygine.core.common.client.input.PlayerInputReader;
import com.anygine.game.client.GameplayClientInjector;
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
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(GwtPlatformerModule.class)
public interface GwtPlatformerInjector 
	extends Ginjector, GameplayClientInjector, GameplayCommonInjector {

	// GameplayClientInjector
	
	PlatformerRenderer getGameplayRenderer();
	PlatformerScreenManager getScreenManager();
	PlayerInputReader getInputReader();
	GameClient getGame();

	PlatformerLevelRenderer getLevelRenderer();
	PlatformerEnemyRenderer getEnemyRenderer();
	PlatformerCollectableRenderer getCollectableRenderer();
	PlatformerSearchableRenderer getSearchableRenderer();
	PlatformerPlayerRenderer getPlayerRenderer();
	PlatformerExitRenderer getExitRenderer();

	// GameplayCommonInjector
	
	PlatformerSimulation getSimulation();
	PlatformerGameComponentFactory getGameComponentFactory();
	PlatformerPlayerImpl getPlayer();
	
}
