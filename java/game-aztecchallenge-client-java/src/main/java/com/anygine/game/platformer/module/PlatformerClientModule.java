package com.anygine.game.platformer.module;

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
