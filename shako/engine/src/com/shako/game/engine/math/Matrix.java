package com.shako.game.engine.math;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

/**
 * Класс по работе с матрицами.
 * - Перемещение.
 * - Поворот.
 * - Масштабирование.
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

        //
        Matrix3 matrix3x3 = new Matrix3();
        // Приводим матрицу 3х3 к единичному ввиду
        // 1 0 0
        // 0 1 0
        // 0 0 1
        matrix3x3.idt();

        //
        Matrix4 matrix4x4 = new Matrix4();
    }
}
