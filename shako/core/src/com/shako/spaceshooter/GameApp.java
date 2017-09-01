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
    public static final float SCREEN_WIDTH = 960f;
    public static final float SCREEN_HEIGHT = 1280f;

    /** */
    public static float VIEWPORT_LEFT;
    public static float VIEWPORT_RIGHT;

    /** */
    public GameApp() {

    }

    @Override
    public void create() {

        // Устанавливаем начальный экран при запуске приложения.
//        setScreen(new MenuScreen(this));
        setScreen(new GameScreen(this));
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        float aspectRatio = (float) width / height;
        float viewportWidth = SCREEN_HEIGHT * aspectRatio;

        VIEWPORT_LEFT = (SCREEN_WIDTH - viewportWidth) / 2;
        VIEWPORT_RIGHT = VIEWPORT_LEFT + viewportWidth;
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
