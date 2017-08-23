package ru.geekbrains.firstgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.geekbrains.screen.GameScreen;

public class MyFIrstGame extends Game {

    @Override
    public void create() {
        Gdx.app.log("MyFIrstGame", "Created");
        setScreen(new GameScreen());
    }
}
