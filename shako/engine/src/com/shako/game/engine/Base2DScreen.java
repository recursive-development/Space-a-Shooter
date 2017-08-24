package com.shako.game.engine;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.InputProcessor;


/**
 *
 * Created by shako on 24-Aug-17.
 */
public class Base2DScreen implements Screen, InputProcessor {

    @Override
    public boolean keyDown(int keycode) {
        System.out.printf("keyDown code[%d]", keycode);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        System.out.printf("ketUp code[%d]", keycode);
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.printf("KeyTyped [%c]", character);
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.printf("touchDown x:%d y:%d\n", screenX ,screenY);
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        System.out.printf("touchUp x:%d y:%d\n", screenX ,screenY);
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        System.out.printf("touchDragged x:%d y:%d\n", screenX ,screenY);
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        System.out.printf("mouseMoved  x:%d y:%d\n", screenX ,screenY);
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        System.out.printf("scrolled: %d\n", amount);
        return false;
    }

    @Override
    public void show() {
        System.out.println("show");

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {
        System.out.printf("resize: %d %d\n", width, height);

    }

    @Override
    public void pause() {
        System.out.println("pause");

    }

    @Override
    public void resume() {
        System.out.println("resume");

    }

    @Override
    public void hide() {
        System.out.println("hide");

    }

    @Override
    public void dispose() {
        System.out.println("dispose");

    }
}
