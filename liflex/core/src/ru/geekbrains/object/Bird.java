package ru.geekbrains.object;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Tom on 22.08.2017.
 */

public class Bird {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // Для обработки поворота птицы
    private int width;
    private int height;

    public Bird(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y); //Определяем позицию по оси Х
        velocity = new Vector2(0, 0); //скорость по оси Y
        acceleration = new Vector2(0, 460);
    }
    public void update(float delta) {

        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y > 200) {
            velocity.y = 200;
        }

        position.add(velocity.cpy().scl(delta));

    }

    public void onClick() {
        velocity.y = -140;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }

}
