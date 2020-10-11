package org.firstinspires.ftc.teamcode.drink;

import org.firstinspires.ftc.teamcode.module.Input;
import org.firstinspires.ftc.teamcode.module.Math;

import java.util.Dictionary;
import java.util.Hashtable;

import static org.firstinspires.ftc.teamcode.module.Input.*;

public class CartAutoController extends DrinkObject {

    // State Management
    public float maxSpeed;

    // Pipe Function
    public Hashtable<String, Object> Pipe(Hashtable<String, Object> input) {

        // Create a New Input Object based on Previous Input
        Hashtable<String, Object> output = input;

        // Set Output to Vertical Move (Dummy Code)
        output.put("motorLFOutput", Math.Clamp(Singleton.getAxis("Cart_Vertical"), -1f, 1f));
        output.put("motorRFOutput", Math.Clamp(Singleton.getAxis("Cart_Vertical"), -1f, 1f));
        output.put("motorLROutput", Math.Clamp(Singleton.getAxis("Cart_Vertical"), -1f, 1f));
        output.put("motorRROutput", Math.Clamp(Singleton.getAxis("Cart_Vertical"), -1f, 1f));

        // Return the Output Object
        return output;

    }

}
