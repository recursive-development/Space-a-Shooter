package com.shako.spaceshooter;

// --- libGDX ---
import com.badlogic.gdx.Game;

// --- Customs ---
import com.shako.spaceshooter.screens.menu.MenuScreen;

/**
 * Главный начальный класс при запуске приложения.
 *
 * @author Alexey Stepchenko
 * @author Timur Kashapov
 */
public class GameApp extends Game {

    @Override
    public void create() {

        // Устанавливаем начальный экран при запуске приложения.
        setScreen(new MenuScreen(this));
    }
}
