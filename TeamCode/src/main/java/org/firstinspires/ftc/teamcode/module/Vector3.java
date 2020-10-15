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
     * @return Returns the magnitude if only looking at the x and y axis
     */
    public float xyAxisMagnitude() {
        return Math.Sqrt((x*x) + (y*y));
    }

    /**
     * @return Returns the magnitude if only looking at the y and z axis
     */
    public float yzAxisMagnitude() {
        return Math.Sqrt((y*y) + (z*z));
    }

    /**
     * @return Returns the magnitude if only looking at the x and z axis
     */
    public float xzAxisMagnitude() {
        return Math.Sqrt((x*x) + (z*z));
    }

    /**
     * @return returns the sin value if only looking at the x and y axis
     */
    public float xySin(){
        //o = y
        //a = x
        return y/xyAxisMagnitude();
    }

    /**
     * @return returns the cos value if only looking at the x and y axis
     */
    public float xyCos(){
        return x/xyAxisMagnitude();
    }

    /**
     * @return returns the tan value if only looking at the x and y axis
     */
    public float xyTan(){
        return(y/x);
    }

    /**
     * @return returns the sin value if only looking at the y and z axis
     */
    public float yzSin(){
        //o = z
        //a = y
        return z/yzAxisMagnitude();
    }

    /**
     * @return returns the cos value if only looking at the y and z axis
     */
    public float yzCos(){
        return y/yzAxisMagnitude();
    }

    /**
     * @return returns the tan value if only looking at the y and z axis
     */
    public float yzTan(){
        return y/z;
    }

    /**
     * @return returns the sin value if only looking at the x and z axis
     */
    public float xzSin() {
        //o = z
        //a = x
        return x / xzAxisMagnitude();
    }

    /**
     * @return returns the cos value if only looking at the x and z axis
     */
    public float xzCos(){
        return x/xzAxisMagnitude();
    }

    /**
     * @return returns the tan value if only looking at the x and z axis
     */
    public float xzTan(){
        return x/z;
    }

    /**
     * Get the negative version of the current vector- the sum of a vector and it's negative should be equal to (0, 0).
     * @return The negative Vector3.
     * @since 1.1
     **/
    public Vector3 Negative() {

        return new Vector3(-x, -y, -z);

    }
}
