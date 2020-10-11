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

}
