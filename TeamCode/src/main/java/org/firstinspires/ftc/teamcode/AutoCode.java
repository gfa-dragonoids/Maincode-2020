// Note: This is my First Time Programming in Java in 2 Years.
// I am also using sublime text, and the robot is not even built yet.
// So, I don't need anyone telling me the code is bad- I will commit the fixes.

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.module.Bartender;

@TeleOp(name = "Autonomous Code", group = "code")
public class AutoCode extends LinearOpMode {

    // I wish this was C# because the code would be so much cleaner
    @Override public void runOpMode() {

        // Initialize the Bartender
        if (!InitializeBartender()) {

            FailTeleop("Failed to Initialize the Bartender.");
            return;

        }

        // Initialize Modules
        if (!InitializeModules()) {

            FailTeleop("Failed to Initialize the Modules.");
            return;

        }

    }

    // Log the Failures
    public void FailTeleop(String error) {

        // Log the problem in the console.
        // Save the current log to a file.

    }

    public boolean InitializeBartender() {

        // Create Singleton
        if (Bartender.Singleton == null) Bartender.Singleton = new Bartender();

        // Add Drinks to Bartender
            // USAGE: Bartender.Singleton.addDrink(drink);

        // Return True
        return true;

    }

    public boolean InitializeModules() {

        // Initialize Modules


        return true;

    }

}