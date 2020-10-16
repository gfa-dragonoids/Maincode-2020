package org.firstinspires.ftc.teamcode.module;

public class Vector3 {

    // NOTE: Sadly there is no operator overloading in Java, so we can not do things like shown below
    // Number * Vector
    // Vector * Vector
    // Vector / Number
    // Vector + Vector

    // Values
    public float x;
    public float y;
    public float z;

    // Templates
    public static Vector3 up = new Vector3(0f, 1f, 0f);
    public static Vector3 right = new Vector3(1f, 0f, 0f);
    public static Vector3 forward = new Vector3(0f, 0f, 1f);
    public static Vector3 one = new Vector3(1f, 1f, 1f);
    public static Vector3 zero = new Vector3(0f, 0f, 0f);

    // Blank Constructor
    public Vector3() {

        x = 0f;
        y = 0f;
        z = 0f;

    }

    // Constructor With Input
    public Vector3(float _x, float _y, float _z) {

        x = _x;
        y = _y;
        z = _z;

    }

    // Get the Magnitude of The Vector
    public float Magnitude() {

        // https://mathinsight.org/definition/magnitude_vector
        return Math.Sqrt((x * x) + (y * y) + (z * z));

    }

    // Get the Normalized Value of a Vector
    public Vector3 Normalized() {

        float magnitude = Magnitude();
        return new Vector3(x / magnitude, y / magnitude, z / magnitude);

    }
    
    /**
    * Get the current tangential of the vector based on its orientation.
    * @param orientation The axis to get the tangential of.
    * @return A floating point number representing the tangential of the vector3's axis.
    * @since 1.1
    **/
    public float Tan(AxisOrientation orientation) {
    
        switch (orientation) {
        
            case orientation.XY:
                return y / x;
            case orientation.ZY:
                return y / z;
            case orientation.XZ:
                return z / x;
        }
    
    }

    /**
     * Get the current sine of the vector based on its orientation.
     * @param orientation The axis to get the sine of.
     * @return A floating point number representing the sine of the vector3's axis.
     * @since 1.1
     **/
    public float Sin(AxisOrientation orientation) {
    
        switch (orientation) {
        
            case orientation.XY:
                return y / Magnitude();
            case orientation.ZY:
                return y / Magnitude();
            case orientation.XZ:
                return z / Magnitude();
        }
    
    }
    
    /**
     * Get the current cosine of the vector based on its orientation.
     * @param orientation The axis to get the cosine of.
     * @return A floating point number representing the cosine of the vector3's axis.
     * @since 1.1
     **/
    public float Cos(AxisOrientation orientation) {
    
        switch (orientation) {
        
            case orientation.XY:
                return x / Magnitude();
            case orientation.ZY:
                return z / Magnitude();
            case orientation.XZ:
                return x / Magnitude();
        
        }
    
    }
    
    /**
     * Get the negative version of the current vector- the sum of a vector and it's negative should be equal to (0, 0, 0).
     * @return The negative Vector3.
     * @since 1.1
     **/
    public Vector3 Negative() {

        return new Vector3(-x, -y, -z);

    }

    /**
     * Add two vectors together.
     * @param a The first Vector3 that is being added.
     * @param b The second Vector3 that is being added.
     * @return The sum of the two Vector3's.
     * @since 1.1
     **/
    public static Vector3 Add(Vector3 a, Vector3 b) {

        return new Vector3(a.x + b.x, a.y + b.y, a.z + b.z);

    }

    /**
     * Multiply two vectors together.
     * @param a The first Vector3 that is being multiplied.
     * @param b The second Vector3 that is being multiplied.
     * @return The product of the two Vector3's.
     * @since 1.1
     **/
    public static Vector3 Multiply(Vector3 a, Vector3 b) {

        return new Vector3(a.x * b.x, a.y * b.y, a.z * b.z);

    }

    /**
     * Multiply a vector by a float.
     * @param a The Vector3 that is being multiplied.
     * @param b The coefficient of the Vector3- a floating point number.
     * @return The product of the Vector3 and the float.
     * @since 1.1
     **/
    public static Vector3 MultiplyFloat(Vector3 a, float b) {

        return new Vector3(b * a.x, b * a.y, b * a.z);

    }
    
    public enum AxisOrientation {
        XY,
        ZY,
        XZ
    }
}
