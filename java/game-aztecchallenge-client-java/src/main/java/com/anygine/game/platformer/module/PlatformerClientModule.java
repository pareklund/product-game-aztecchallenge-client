package com.anygine.game.platformer.module;

import CollectableRenderer;
import playn.core.Assets;
import playn.core.Game;
import playn.core.PlayN;

import com.anygine.core.client.client.GameClient;
import com.anygine.core.client.client.api.ClientSessionManager;
import com.anygine.core.client.client.api.DevPlayerSessionManager;
import com.anygine.core.client.client.render.EnemyRenderer;
import com.anygine.core.client.client.render.ExitRenderer;
import com.anygine.core.client.client.render.LevelRenderer;
import com.anygine.core.client.client.render.PlayerRenderer;
import com.anygine.core.client.client.render.ProjectileRenderer;
import com.anygine.core.client.client.render.SearchableRenderer;
import com.anygine.core.client.client.render.SimulationRenderer;
import com.anygine.core.client.client.service.ClientProfileService;
import com.anygine.core.common.client.Profile;
import com.anygine.core.common.client.api.EntityFactory;
import com.anygine.core.common.client.api.EntityService;
import com.anygine.core.common.client.api.EntityStorage;
import com.anygine.core.common.client.api.JsonWritableFactory;
import com.anygine.core.common.client.api.ProfileService;
import com.anygine.core.common.client.api.SessionManager;
import com.anygine.core.common.client.domain.EntityFactoryImpl;
import com.anygine.core.common.client.domain.EntityServiceImpl;
import com.anygine.core.common.client.domain.EntityStorageImpl;
import com.anygine.core.common.client.domain.GameComponentBase;
import com.anygine.core.common.client.domain.JsonWritableFactoryImpl;
import com.anygine.core.common.client.input.InputReader;
import com.anygine.core.common.client.input.PlayerInputReader;
import com.anygine.game.client.screen.ScreenManager;
import com.anygine.game.platformer.client.PlatformerCollectableRenderer;
import com.anygine.game.platformer.client.PlatformerEnemyRenderer;
import com.anygine.game.platformer.client.PlatformerExitRenderer;
import com.anygine.game.platformer.client.PlatformerPlayerRenderer;
import com.anygine.game.platformer.client.PlatformerProjectileRenderer;
import com.anygine.game.platformer.client.PlatformerSearchableRenderer;
import com.anygine.game.platformer.client.core.PlatformerLevelRenderer;
import com.anygine.game.platformer.client.core.PlatformerRenderer;
import com.anygine.game.platformer.client.screen.PlatformerScreenManager;
import com.google.inject.AbstractModule;

public class PlatformerClientModule extends AbstractModule {

	@Override
	protected void configure() {
    bind(JsonWritableFactory.class).to(JsonWritableFactoryImpl.class);
    bind(EntityFactory.class).to(EntityFactoryImpl.class);
    bind(ScreenManager.class).to(PlatformerScreenManager.class);
		bind(Game.class).to(GameClient.class);
		bind(InputReader.class).to(PlayerInputReader.class);
		bind(SimulationRenderer.class).to(PlatformerRenderer.class);
		bind(LevelRenderer.class).to(PlatformerLevelRenderer.class);
		bind(EnemyRenderer.class).to(PlatformerEnemyRenderer.class);
		bind(SearchableRenderer.class).to(PlatformerSearchableRenderer.class);
		bind(CollectableRenderer.class).to(PlatformerCollectableRenderer.class);
		bind(PlayerRenderer.class).to(PlatformerPlayerRenderer.class);
		bind(ExitRenderer.class).to(PlatformerExitRenderer.class);
		bind(ProjectileRenderer.class).to(PlatformerProjectileRenderer.class);
		bind(ClientSessionManager.class).to(DevPlayerSessionManager.class);
    bind(SessionManager.class).to(DevPlayerSessionManager.class);
    bind(ProfileService.class).to(ClientProfileService.class);
    Assets assetManager = PlayN.assets();
		bind(Assets.class).toInstance(assetManager);
    bind(EntityService.class).to(EntityServiceImpl.class);
    bind(EntityStorage.class).to(EntityStorageImpl.class);    
		requestStaticInjection(GameComponentBase.class);
	  requestStaticInjection(Profile.class);
//    requestStaticInjection(JsonWritableBase.class);
//    requestStaticInjection(EntityBase.class);
    requestStaticInjection(EntityServiceImpl.class);
	}

}
