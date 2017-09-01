package com.shako.spaceshooter;

// --- libGDX ---
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

// --- Customs ---
import com.shako.spaceshooter.screens.menu.MenuScreen;
import com.shako.spaceshooter.screens.game.GameScreen;

/**
 * Класс для запуска приложения.
 *
 * @author Alexey Stepchenko
 * @author Timur Kashapov
 */
public class GameApp extends Game {

    /** */
    public GameApp() {

    }

    @Override
    public void create() {

        // Устанавливаем начальный экран при запуске приложения.
//        setScreen(new MenuScreen(this));
        setScreen(new GameScreen(this));
    }
}
