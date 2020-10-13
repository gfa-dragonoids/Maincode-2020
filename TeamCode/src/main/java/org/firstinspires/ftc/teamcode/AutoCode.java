// Note: This is my First Time Programming in Java in 2 Years.
// I am also using sublime text, and the robot is not even built yet.
// So, I don't need anyone telling me the code is bad- I will commit the fixes.

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.ReadWriteFile;

import org.firstinspires.ftc.robotcore.internal.system.AppUtil;
import org.firstinspires.ftc.teamcode.drink.MechanimManualController;
import org.firstinspires.ftc.teamcode.module.Bartender;
import org.firstinspires.ftc.teamcode.module.Input;

import java.io.File;

@TeleOp(name = "Autonomous Code", group = "code")
public class AutoCode extends LinearOpMode {

    public DcMotor rightFront;
    public DcMotor leftFront;
    public DcMotor rightRear;
    public DcMotor leftRear;

    @Override
    public void runOpMode() {

        // Initialize the Hardware/ Check if Initializing Failed.
        if (!InitializeHardware()) {

            FailTeleop("Failed to Initialize the Hardware.");
            return;

        }
        
        // Initialize the Bartender/ Check if Initializing Failed.
        if (!InitializeBartender()) {

            FailTeleop("Failed to Initialize the Bartender.");
            return;

        }

        // Initialize Modules/ Check if Initializing Failed.
        if (!InitializeModules()) {

            FailTeleop("Failed to Initialize the Modules.");
            return;

        }
        
        // Check for Stuffs
        boolean stuffs = true;
        
        while(stuffs) {
    
            // Do Stuff
            Bartender.Singleton.getDrinkOutput();
            
        }
        
    }

    /**
     * Logs the reason why the robot's code has crashed, saves the logs of the robot, and exits the main loop.
     * @param error The reason for why the robot has crashed.
     * @since ∞ + 1
     * **/
    public void FailTeleop(String error) {

        // Log the problem in the console.
        System.out.println("Robot Error: " + error);

        // Log the problem to the robot console
        telemetry.addData("Status", "Robot Crashed Due to Error.");
        telemetry.addData("Error", error);
        telemetry.update();

        // Save the current log to a file.
        File errorLog = AppUtil.getInstance().getSettingsFile("errorLog.txt");

        String fileContents = "##########\n" +
                "# NEW LOG #\n" +
                "##########\n" +
                "\n" +
                "Error: " + error + "\n\n";

        ReadWriteFile.writeFile(errorLog, fileContents);

    }

    /**
     * Initialize the Hardware of the Robot.
     * @return  <code>true</code> The initialization of the robot's hardware was a success.
     *          <code>false</code> The initialization of the robot's hardware has failed.
     * @since ∞ + 1
     * **/
    public boolean InitializeHardware() {
    
        // Log Status to Console.
        telemetry.addData("Status", "Initializing Hardware.");
        System.out.println("Initializing Hardware.");
        telemetry.update();
        
        // Initialize all of the motors for the cart.
        rightFront = hardwareMap.dcMotor.get("rf");
        leftFront = hardwareMap.dcMotor.get("lf");
        rightRear = hardwareMap.dcMotor.get("rr");
        leftRear = hardwareMap.dcMotor.get("lr");

        // Stop and reset all of the motors- for peace of mind.
        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // Set all of the run modes to be without encoders.
        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Set all of the motors to brake when they do not have power.
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Log output to console
        telemetry.addData("Status", "Successfully Initiated Hardware");
        telemetry.update();

        // Since everything worked, return true.
        return true;

    }

    /**
     * Initialize the Bartender object- this will allow for the drinks to be loaded into the robot.
     * @return  <code>true</code> The initialization of the Bartender was a success.
     *          <code>false</code> The initialization of the Bartender has failed.
     * @since ∞ + 1
     * **/
    public boolean InitializeBartender() {
    
        // Log Status to Console.
        telemetry.addData("Status", "Initializing Bartender.");
        System.out.println("Initializing Bartender.");
        telemetry.update();
        
        // Create Singleton
        if (Bartender.Singleton == null) Bartender.Singleton = new Bartender();

        // Add Drinks to Bartender
            // USAGE: Bartender.Singleton.addDrink(drink);
        Bartender.Singleton.addDrink(new MechanimManualController());

        // Since everything worked, return true.
        return true;

    }

    /**
     * Initialize the modules- this will allow for the drinks to access functions and info outside of themselves.
     * @return  <code>true</code> The initialization of the modules was a success.<br>
     *          <code>false</code> The initialization of the modules has failed.
     * @since ∞ + 1
     * **/
    public boolean InitializeModules() {
    
        // Log Status to Console.
        telemetry.addData("Status", "Initializing Modules.");
        System.out.println("Initializing Modules.");
        telemetry.update();
        
        // Initialize Modules
        if (Input.Singleton == null) Input.Singleton = new Input(gamepad1, gamepad2);
        
        // Since everything worked, return true.
        return true;

    }

}