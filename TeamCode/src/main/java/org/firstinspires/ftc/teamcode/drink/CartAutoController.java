package org.firstinspires.ftc.teamcode.drink;

import org.firstinspires.ftc.teamcode.module.Input;

public class CartAutoController extends DrinkObject {

    // State Management
    public float maxSpeed;

    // Pipe Function
    public OutputObject Pipe(OutputObject input) {

        // Create a New Input Object based on Previous Input
        OutputObject output = input;

        // Set Output to Vertical Move (Dummy Code)
        output.motorLFOutput = Input.Singleton.getAxis("Cart_Vertical");
        output.motorRFOutput = Input.Singleton.getAxis("Cart_Vertical");
        output.motorLROutput = Input.Singleton.getAxis("Cart_Vertical");
        output.motorRROutput = Input.Singleton.getAxis("Cart_Vertical");

        // Return the Output Object
        return output;

    }

}
