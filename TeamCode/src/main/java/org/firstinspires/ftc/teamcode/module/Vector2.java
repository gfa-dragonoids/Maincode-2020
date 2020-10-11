package org.firstinspires.ftc.teamcode.module;

import java.util.Vector;

public class Vector2 {

    // Values
    public float x;
    public float y;

    // Templates
    public static Vector2 one = new Vector2(1f, 1f);
    public static Vector2 up = new Vector2(0f, 1f);
    public static Vector2 right = new Vector2(1f, 0f);
    public static Vector2 zero = new Vector2(0f, 0f);

    // Blank Constructor
    public Vector2() {

        x = 0f;
        y = 0f;

    }

    // Constructor With Values
    public Vector2(float _x, float _y) {

        x = _x;
        y = _y;

    }

    // Get the Magnitude of a Vector
        // Uses Pythagorean Theorem
    public float Magnitude() {

        return Math.Sqrt((x * x) + (y * y));

    }

    // Normalized Function
        // Get the Normalized Value of the Vector
    public Vector2 Normalized() {

        // Find the Magnitude and Divide Current X and Y Values By It
        float magnitude = Magnitude();
        return new Vector2(x / magnitude, y / magnitude);

    }

}
