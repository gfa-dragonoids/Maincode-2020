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
     * Find the sine value of a vector- based on basic trigonometry. 
     * @return The floating point sine value of the vector.
     * @since 1.1
     */
    public float Sin() {
        
        return y / Magnitude();
    
    }

    /**
     * Find the cosine value of a vector- based on basic trigonometry.
     * @return The floating point cosine value of the vector.
     * @since 1.1
     */
    public float Cos() {
        
        return x / Magnitude();
    
    }

    /**
     * Find the tangential value of a vector- based on basic trigonometry.
     * @return The floating point tangential value of the vector.
     * @since 1.1
     */
    public float Tan() {
        
        return y / x;
    
    }

    /**
    * Get the negative version of the current vector- the sum of a vector and it's negative should be equal to (0, 0).
    * @return The negative Vector2.
    * @since 1.1
    **/
    public Vector2 Negative() {
    
        return new Vector2(-x, -y);
    
    }
    
    /**
    * Add two vectors together.
    * @param The first Vector2 that is being added.
    * @param The second Vector2 that is being added.
    * @return The sum of the two Vector2's.
    * @since 1.1
    **/
    public static Vector2 Add(Vector2 a, Vector2 b) {
    
        return new Vector2(a.x + b.x, a.y + b.y);
    
    }
    
    /**
    * Multiply two vectors together.
    * @param The first Vector2 that is being multiplied.
    * @param The second Vector2 that is being multiplied.
    * @return The product of the two Vector2's.
    * @since 1.1
    **/
    public static Vector2 Multiply(Vector2 a, Vector2 b) {
    
        return new Vector2(a.x * b.x, a.y * b.y);
    
    }
    
    /**
    * Multiply a vector by a float. 
    * @param The Vector2 that is being multiplied.
    * @param The coefficient of the Vector2- a floating point number.
    * @return The product of the Vector2 and the float.
    * @since 1.1
    **/
    public static Vector2 MultiplyFloat(Vector2 a, float b) {
    
        return new Vector2(b * a.x, b * a.y);
    
    }
    
}
