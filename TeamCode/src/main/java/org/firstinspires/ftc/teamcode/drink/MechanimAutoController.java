package org.firstinspires.ftc.teamcode.drink;

import org.firstinspires.ftc.teamcode.module.Input;

import java.util.Hashtable;

public class MechanimAutoController extends DrinkObject{
    float reducedSpeedModifier = 0.4f;

    @Override
    public Hashtable<String, Object> Pipe(Hashtable<String, Object> input) {

        // Initialize the Hashtable
        Hashtable<String, Object> output = input;

        // Get the Input Axises
        float drive = Input.Singleton.getAxis("Vertical");
        float strafe = Input.Singleton.getAxis("Horizontal");
        float rotate = Input.Singleton.getAxis("Rotation");
        float reducedSpeed = Input.Singleton.getButton("Slow") ? reducedSpeedModifier : 1f;

        // Put the output into the motors
        output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
        output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
        output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
        output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));

        // Return the Output
        return output;

    }
}
