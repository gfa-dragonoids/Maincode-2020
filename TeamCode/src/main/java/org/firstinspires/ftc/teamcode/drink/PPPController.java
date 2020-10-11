package org.firstinspires.ftc.teamcode.drink;

import org.firstinspires.ftc.teamcode.module.*;
import org.firstinspires.ftc.teamcode.module.Math;

// Play Pen Protocol Controller
public class PPPController extends DrinkObject {

    public Vector2 Position;

    public PPPController(int config) {

        switch (config) {

            case 0:
                // Blue Alliance 1st Start
                Position = new Vector2();
                break;
            case 1:
                // Blue Alliance 2nd Start
                Position = new Vector2();
                break;
            case 2:
                // Red Alliance 1st Start
                Position = new Vector2();
                break;
            case 3:
                // Red Alliance 2nd Start
                Position = new Vector2();
                break;
        }

    }

    public OutputObject Pipe(OutputObject input) {

        // Create a New Input Object based on Previous Input
        OutputObject output = input;

        // For Testing, Check if The Position.X is Less than 0
            // If So, Stop The Cart Motor
        if (Position.x > 0) {

            output.motorLFOutput = 0;
            output.motorRFOutput = 0;
            output.motorLROutput = 0;
            output.motorRROutput = 0;

        }

        // Return the Output Object
        return output;

    }

}
