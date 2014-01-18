package com.anygine.game.platformer;

import playn.core.Game;
import playn.core.PlayN;
import playn.java.JavaAssets;
import playn.java.JavaPlatform;

import com.anygine.core.client.client.GameplayClientInjectorBase;
import com.anygine.core.client.client.api.ClientSessionManager;
import com.anygine.core.common.client.inject.GameplayCommonInjectorImpl;
import com.anygine.core.common.client.inject.GameplayCommonInjectorManager;
import com.anygine.core.common.client.inject.PlayNInjectorManager;
import com.anygine.core.common.inject.CoreCommonInjectorManager;
import com.anygine.game.client.GameplayClientInjectorManager;
import com.anygine.game.platformer.common.client.module.PlatformerCommonModule;
import com.anygine.game.platformer.module.PlatformerClientModule;
import com.anygine.game.platformer.module.PlatformerClientPlayNModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class PlatformerJava {

  public static void main(String[] args) {

    JavaAssets assets = JavaPlatform.register().assets();
    assets.setPathPrefix("com/anygine/game/platformer/resources");

    Injector injector = Guice.createInjector(new PlatformerClientPlayNModule());
    PlayNInjectorManager.setInjector(injector);

    injector = Guice.createInjector(
        new PlatformerCommonModule(), new PlatformerClientModule());

    CoreCommonInjectorManager.setInjector(injector);

    GameplayCommonInjectorManager.setInjector(
        new GameplayCommonInjectorImpl(injector, ClientSessionManager.class));

    GameplayClientInjectorManager.setInjector(
        new GameplayClientInjectorBase(injector));

    Game game = GameplayClientInjectorManager.getInjector().getGame();
    PlayN.run(game);
  }
}
