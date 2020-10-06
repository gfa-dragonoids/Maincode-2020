# Redteam-2020
This is the code for GFA's Red Team robot. If you are looking for GFA's Blue Team robot code, it is located [here](github.com/gfa-dragonoids/Blueteam-2020). If you are another team looking to see how our code works, it is licensed under the ISC license. To learn more about the ISC license, [click here](https://en.wikipedia.org/wiki/ISC_license#:~:text=The%20ISC%20license%20is%20a,unnecessary%20following%20the%20Berne%20Convention.). But, in short, you can copy, modify, or delete any of our code, but you must make it clear that the code was from the GFA Dragonoid's 2020-2021 Red Team.

## Red Team Members

## Code Structure
The redteam code this year will be using the 'plug and chug' method. The general idea is that all the functionality of the robot is seperated into modules (known as drinks). Each drink manages it's own state, and inherits from the DrinkObject class. The drink object class has a virtual method, known as 'Pipe'. The pipe method intakes a RobotOutputObject, and outputs one as well. This means that multiple of these pipe functions can be run with the last function's output being the next function's input. This will allow for some pipes to be in control of outputs, and others to just act as affects. To control all of the piping, there is a singleton class known as the 'Bartender'. The bartender allows the Main Function to modify the piping format, and get the output data without leading to spaghetti code. All of the input for the Robot is in different singleton classes: ControllerManager, SensorManager, and MotorManager. This will allow our programmers to maximize the efficiency and simplicity that comes with Object Oriented Programming. 

## Todo
