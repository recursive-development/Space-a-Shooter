package ru.geekbrains.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import ru.geekbrains.gameHelpers.InputHandler;
import ru.geekbrains.world.GameWorld;


public class GameScreen implements Screen {
    private GameWorld world;
    private ru.geekbrains.world.GameRenderer renderer;
    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);
        int midPointY = (int) (gameHeight / 2);
        world = new GameWorld(midPointY);
        renderer = new ru.geekbrains.world.GameRenderer(world); //Здесь отрисовка объектов
        Gdx.input.setInputProcessor(new InputHandler(world.getBird())); //использовать наш новый InputHandler как его же собственный процессор.
    }


    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void render(float delta) {
        //Gdx.app.log("GameScreen FPS", (1/delta) + "");
        world.update(delta);
        renderer.render();

    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void dispose() {

    }
}
