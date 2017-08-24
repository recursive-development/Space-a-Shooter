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
        System.out.println("keyDown " + keycode);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        System.out.println("ketUp " + keycode);
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.println("KeyTyped");
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("");
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        System.out.println("");
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        System.out.println("");
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        System.out.println("");
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        System.out.println("");
        return false;
    }

    @Override
    public void show() {
        System.out.println("");

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {
        System.out.println("");

    }

    @Override
    public void pause() {
        System.out.println("");

    }

    @Override
    public void resume() {
        System.out.println("");

    }

    @Override
    public void hide() {
        System.out.println("");

    }

    @Override
    public void dispose() {
        System.out.println("");

    }
}
