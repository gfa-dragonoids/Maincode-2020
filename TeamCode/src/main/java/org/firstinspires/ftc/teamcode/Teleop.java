// Note: This is my First Time Programming in Java in 2 Years.
// I am also using sublime text, and the robot is not even built yet.
// So, I don't need anyone telling me the code is bad- I will commit the fixes.

@TeleOp(name = "Autonomous Code", group = "code")
public class AutoCode extends LinearOpMode {

    // I wish this was C# because the code would be so much cleaner
    @Override public void runOpMode() {

        // Initialize the Bartender
        if (!InitializeBartender()) return FailTeleop("Failed Initializing Bartender");

        // Initialize Modules
        if (!InitializeModules()) return FailTeleop("Failed Initializing Modules.");

    }

    // Log the Failures
    public void FailTeleop(String error) {

        // Log the problem in the console.
        // Save the current log to a file.

    }

    public boolean InitializeBartender() {

        return true;

    }

    public boolean InitializeModules() {

        return true;

    }

}