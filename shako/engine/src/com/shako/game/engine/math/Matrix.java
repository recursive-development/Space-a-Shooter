package com.shako.game.engine.math;

// --- libGDX ---
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;

/**
 * Класс по работе с матрицами.
 * - translate() Перемещение.
 * - rotate()    Поворот.
 * - scale()     Масштабирование.
 *
 * @author Alexey Stepchenko
 * @author Timur Kashapov
 */

public class Matrix {

    /** */
    private Matrix() {
        // TO-DO
    }

    /** */
    public static void transformation() {

        // Векторы
        Vector2 vector2 = new Vector2();

        // Создание матрицы 3x3 (работа с 2D):
        // | 0 0 0 |
        // | 0 0 0 |
        // | 0 0 0 |
        Matrix3 matrix3x3 = new Matrix3();

        // Приводим матрицу 3х3 к "единичному" ввиду.
        // | 1 0 0 |
        // | 0 1 0 |
        // | 0 0 1 |
        matrix3x3.idt();

        // Создание матрицы 4x4 (работа с 3D):
        // | 0 0 0 0 |
        // | 0 0 0 0 |
        // | 0 0 0 0 |
        // | 0 0 0 0 |
        Matrix4 matrix4x4 = new Matrix4();

        // Методы для преобразования матриц:
        // translate()
        // scale()
        // rotate()

        // ! преобразования происходят в обратном порядке !
        // <----- . <-------- . <---- . <----- . <--------
        // matrix3.translate().scale().rotate().translate()

        // Умножаем вектор на матрицу
        //
        //  Матрица    Вектор
        // | x x x |   | x |
        // | x x x | x | y |
        // | 0 0 1 |   | 1 |
        vector2.mul(matrix3x3);
    }
}
