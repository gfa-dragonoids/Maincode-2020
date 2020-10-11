package org.firstinspires.ftc.teamcode.module;

public class Math {

    public static float PI = 3.14159265358979f;
    public static float Deg2Rad = PI / 180;
    public static float Rad2Deg = 180 / PI;

    // Clamp Value Between Two Floats
        // Val = Value to Clamp
        // Min = Minimum Value
        // Max = Maximum Value
    public static float Clamp(float val, float min, float max) {

        if (val >= max) return max;
        if (val <= min) return min;
        return val;

    }

    // Rounds a Number Using Int Rounding
        // val = Number to Round
    public static float Round(float val) {

        return (float)((int)val);

    }

    // Lerp Between Two Floats
        // F = Interpolation (Between 0 and 1)
        // A = Float A
        // B = Float B
    public static float Lerp(float f, float a, float b) {

        return a + f * (b - a);

    }

    // Absolute Value Function
        // A = Value to Make Absolute
    public static float Abs(float a) {

        return (a > 0) ? a : -a;

    }

    // Tan Function
        // A = Angle to Find the Tan of
    public static float Tan(float a) {

        return Sin(a) / Cos(a);

    }

    // Inverse Tan Function
        // A = Angle To Find the Cot of
    public static float Cot(float a) {

        return Cos(a) / Sin(a);

    }

    // Cos Function
        // A = Angle to Find the Cos of
    public static float Cos(float a) {

        // Unimplemented
        return 0f;

    }

    // Inverse Cos Function
        // A = Angle To Find the Sec of
    public static float Sec(float a) {

        return 1 / Cos(a);

    }

    // Stolen from [Here](https://stackoverflow.com/questions/2284860/how-does-c-compute-sin-and-other-math-functions)
    public static float Sin(float a){
        int i = 1;
        float cur = a;
        float acc = 1;
        float fact= 1;
        float pow = a;
        while (Abs(acc) > .00000001 &&   i < 100){
            fact *= ((2*i)*(2*i+1));
            pow *= -1 * a*a;
            acc =  pow / fact;
            cur += acc;
            i++;
        }
        return cur;

    }

    // Inverse Sin Function
        // A = Angle To Find the Csc of
    public static float Csc(float a) {

        return 1 / Sin(a);

    }

    // Maximum Value Function
        // A = Value A
        // B = Value B
    public static float Max(float a, float b) {

        return (a > b) ? a : b;

    }

    // Minimum Value Function
        // A = Value A
        // B = Value B
    public static float Min(float a, float b) {

        return (a < b) ? a : b;

    }

    // Check If Number is Base Two
        // Number - Number to Check If It's Base Two
    public static boolean IsBaseTwo(int number) {

        // If Number Has a 1 in the First Digit, Mask Will keep It- return value will be 0x01 or 0x00.
        int mask = 0x01;
        return ((number & mask) == 0);

    }

    // Exponent Function
        // X = Number Raised to a Power
        // A = Power That the Number is Raised To
    public static float Exp(float x, float a) {

        float out = 1;

        for (int n = 0; n < a; n++)
            out *= x;

        return out;

    }

}
