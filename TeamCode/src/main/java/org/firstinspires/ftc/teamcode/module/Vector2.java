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

    /**
     * @return returns the sin value of the vector (sohcahtoa, soh, sin(a) = opposite/hypotonuse)
     * @since 1.1
     */
    public float Sin(){
        return (this.y/Magnitude());
    }

    /**
     * @return returns the cos value of the vector (sohcahtoa, cha, cos(a) = adjacent/hypotonuse)
     * @since 1.1
     */
    public float Cos(){
        return (this.x/Magnitude());
    }

    /**
     * @return returns the tan value of the vector (sohcahtoa, toa, tan(a) = opposite/adjacent)
     * @since 1.1
     */
    public float Tan(){
        return (this.y/this.x);
    }

    /**
     * NOTE: Add function may not be correct, subject to change
     * @return returns the values of the x and y vector components added together
     * @since 1.1
     */
    public float Add(){
        return (this.x + this.y);
    }

    /**
     * NOTE: Subtract function may not be correct, subject to change
     * @return returns the values of the y value subtracted from the x value
     * @since 1.1
     */
    public float SubXY(){
        return (this.x - this.y);
    }

    /**
     * NOTE: Subtract function may not be correct, subject to change
     * @return returns the values of the x value subtracted from the y value
     * @since 1.1
     */
    public float SubYX(){
        return (this.y - this.x);
    }

    /**
     * NOTE: Multiply function may not be correct, subject to change
     * @return returns the values of the x and y float values added together
     * @since 1.1
     */
    public float FloatMult(){
        return (this.x * this.y);
    }

    /**
     * NOTE: Multiply function may not be correct, subject to change
     * @return returns the int values of the x and y float values added together
     * @since 1.1
     */
    public float IntMult(){
        return (int(this.x) * int(this.y));
    }
}
