package com.shako.spaceshooter.screens.menu;

// --- ---
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
// --- ---
import com.shako.game.engine.Base2DScreen;

/**
 *
 * Экран для меню приложения.
 *
 * @author Alexey Stepchenko
 * @author Timur Kashapov
 *
 */
public class MenuScreen extends Base2DScreen {

    private SpriteBatch batch;

    /** Фоновое изображение для экрана меню. */
    private Texture bkgd;

    /** */
    public MenuScreen() {

        batch = new SpriteBatch();

        bkgd  = new Texture("sunset_1920x1200.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        // Начало отрисовки
        batch.begin();

        batch.draw(bkgd, 0, 0);

        batch.end();
        // Конец отрисовки
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dispose() {

        // Освобождаем ресурсы
        batch.dispose();
        super.dispose();
    }
}
