package org.firstinspires.ftc.teamcode.module;

public class Math {

    public static float PI = 3.14159265358979f;
    public static float Deg2Rad = PI / 180;
    public static float Rad2Deg = 180 / PI;

    /**
     * Clamp value between two floating point numbers.
     * @param max The maximum value for the floating point number.
     * @param min The minimum value for the floating point number.
     * @param val The floating point number that will be clamped.
     * @return Clamped floating point number.
     * @since 1.0
     * **/
    public static float Clamp(float val, float min, float max) {

        if (val >= max) return max;
        if (val <= min) return min;
        return val;

    }

    /**
     * Rounds the floating point number to the closest integer value.
     * @param val The floating point number to be rounded to the closest integer.
     * @return Rounded floating point number.
     * @since 1.0
     * **/
    public static float Round(float val) {

        return (float)((int)val);

    }

    /**
     * Linearly Interpolate between two floating point numbers.
     * @param a The first floating point number, representing an x value of 0.
     * @param b The second floating point number, representing an x value of 1.
     * @param f The linear interpolation amount. It must be between 0 and 1.
     * @return A floating point number representing the mixture between the first and second floating point numbers.
     * @since 1.0
     * **/
    public static float Lerp(float f, float a, float b) {

        if (f > 1) return b;
        if (f < 0) return a;
        return a + f * (b - a);

    }

    /**
     * Linearly Interpolate between two floating point numbers without being clamped between 0 and 1.
     * NOTE: This function is unsafe because it can output values greater than A or B.
     * @param a The first floating point number, representing an x value of 0.
     * @param b The second floating point number, representing an x value of 1.
     * @param f The linear interpolation amount.
     * @return A floating point number representing the mixture between the first and second floating point numbers.
     * @since 1.0
     * **/
    public static float LerpUnclamped(float f, float a, float b) {

        return a + f * (b - a);

    }

    /**
     * Get the absolute value of any floating point number.
     * @param val The floating point number to get the absolute value of.
     * @return The absolute value of the floating point number inputted.
     * @since 1.0
     * **/
    public static float Abs(float val) {

        // 0 - a runs faster than multiplying a by -1.
        return (val > 0) ? val : 0 - val;

    }

    /**
     * Get the tangent of any floating point number.
     * NOTE: The input is in degrees, not radians.
     * @param val The floating point angle to get the tangent of.
     * @return The tangent of the floating point angle inputted.
     * @since 1.0
     * **/
    public static float Tan(float val) {

        return Sin(val) / Cos(val);

    }

    /**
     * Get the cotangent of any floating point number.
     * NOTE: The input is in degrees, not radians.
     * @param val The floating point angle to get the cotangent of.
     * @return The cotangent of the floating point angle inputted.
     * @since 1.0
     * **/
    public static float Cot(float val) {

        return Cos(val) / Sin(val);

    }

    /**
     * Get the cosine of any floating point number.
     * NOTE: The input is in degrees, not radians.
     * @param val The floating point angle to get the cosine of.
     * @return The cosine of the floating point angle inputted.
     * @since 1.0
     * **/
    public static float Cos(float val) {

        // Unimplemented
        return 0f;

    }

    /**
     * Get the secant of any floating point number.
     * NOTE: The input is in degrees, not radians.
     * @param val The floating point angle to get the secant of.
     * @return The secant of the floating point angle inputted.
     * @since 1.0
     * **/
    public static float Sec(float val) {

        return 1 / Cos(val);

    }

    /**
     * Get the sine of any floating point number.
     * NOTE: The input is in degrees, not radians.
     * @link https://stackoverflow.com/questions/2284860/how-does-c-compute-sin-and-other-math-functions
     * @param val The floating point angle to get the sine of.
     * @return The sine of the floating point angle inputted.
     * @since 1.0
     * **/
    public static float Sin(float val){
        int i = 1;
        float cur = val;
        float acc = 1;
        float fact= 1;
        float pow = val;
        while (Abs(acc) > .00000001 &&   i < 100){
            fact *= ((2*i)*(2*i+1));
            pow *= -1 * val*val;
            acc =  pow / fact;
            cur += acc;
            i++;
        }
        return cur;

    }

    /**
     * Get the cosecant of any floating point number.
     * NOTE: The input is in degrees, not radians.
     * @param val The floating point angle to get the cosecant of.
     * @return The cosecant of the floating point angle inputted.
     * @since 1.0
     * **/
    public static float Csc(float val) {

        return 1 / Sin(val);

    }

    /**
     * Get the maximum value of two floating point numbers.
     * @param a The first floating point number.
     * @param b The second floating point number.
     * @return The maximum value, either a or b.
     * @since 1.0
     * **/
    public static float Max(float a, float b) {

        return (a > b) ? a : b;

    }

    /**
     * Get the minimum value of two floating point numbers.
     * @param a The first floating point number.
     * @param b The second floating point number.
     * @return The minimum value, either a or b.
     * @since 1.0
     * **/
    public static float Min(float a, float b) {

        return (a < b) ? a : b;

    }

    /**
     * Get the square root of a floating point number.
     * @link https://stackoverflow.com/questions/3581528/how-is-the-square-root-function-implemented
     * @param val The floating point number to find the square root of.
     * @return The square root of the floating point number inputted.
     * @since 1.0
     * **/
    public static float Sqrt(float val){
        // Max and min are used to take into account numbers less than 1
        float lo = Min(1, val);
        float hi = Max(1, val);
        float mid = 0f;

        // Update the bounds to be off the target by a factor of 10
        while(100 * lo * lo < val) lo *= 10;
        while(100 * hi * hi > val) hi *= 0.1;

        for(int i = 0 ; i < 100 ; i++){
            mid = (lo+hi)/2;
            if(mid*mid == val) return mid;
            if(mid*mid > val) hi = mid;
            else lo = mid;
        }
        return mid;
    }

    /**
     * Check if an integer is base two.
     * @param val The integer being inputted into the function.
     * @return <code>true</code> The integer is base two;
     *         <code>false</code> The integer is not base two.
     * @since 1.0
     * **/
    public static boolean IsBaseTwo(int val) {

        // If the number has a 1 in the first digit, the mask will keep it- return value will be 0x01 or 0x00 (true or false in boolean terms).
        int mask = 0x01;
        return ((val & mask) == 0);

    }

    /**
     * Check if a floating point number is base two.
     * @param val The floating point number being inputted into the function.
     * @return <code>true</code> The floating point number is base two;
     *         <code>false</code> The floating point number is not base two.
     * @since 1.0
     * **/
    public static boolean IsBaseTwo(float val) {

        // If the value has a remainder when divided by two, then it is not base two, otherwise, it is.
        return (val % 2) == 0;

    }

    /**
     * Find the greatest common divisor between two numbers.
     * @param a The first integer to be inputted.
     * @param b The second integer to be inputted.
     * @return The greatest common divisor between <code>a</code> and <code>b</code>.
     * @since 1.0
     * **/
    public static int GCD(int a, int b) {

        int gcd;

        for(int i = 1; (i <= a && i <= b); ++i)
            if((a % i == 0) && (b % i == 0))
                gcd = i;

        return 0;

    }

    /**
     * Raise a floating point number to the power of another floating point number.
     * @param x The floating point number that is being raised to a power by <code>a</code>.
     * @param a The floating point number that is used as an exponent for <code>x</code>.
     * @return The floating point number that represents <code>x</code> raised to the <code>a</code> power.
     * @since 1.0
     * **/
    public static float Exp(float x, float a) {

        float out = 1;

        for (int n = 0; n < a; n++)
            out *= x;

        return out;

    }

    /**
     * Round a number upwards to the highest whole number within reach.
     * @param val The floating point number to ceil.
     * @return Ceiled version of val.
     * @since 1.1
     */
    public static float Ceil(float val) {

        return (val == (float)((int)val)) ? ((int)val + 1) : ((int)val);

    }

    /**
     * Round a number downwards to the lowest whole number within reach.
     * @param val The floating point number to floor.
     * @return Floored version of val.
     * @since 1.1
     */
    public static float Floor(float val) {

        return (val == (float)((int)val)) ? ((int)val) : ((int)val - 1);

    }
}
