package com.shako.spaceshooter;

// --- libGDX ---
import com.badlogic.gdx.Game;

// --- Customs ---
// import com.shako.spaceshooter.screens.menu.MenuScreen;
import com.shako.spaceshooter.screens.game.GameScreen;

/**
 * Класс запуска игрового приложения.
 *
 * @author Alexey Stepchenko
 * @author Timur Kashapov
 */
public class GameApp extends Game {

    /** */
    public GameApp() {
    } // GameApp()

    /** */
    @Override
    public void create() {

        // Устанавливаем начальный экран при запуске приложения.
        //
        // setScreen(new MenuScreen(this));
        setScreen(new GameScreen(this));

    } // create()
} // GameApp
