package org.firstinspires.ftc.teamcode.drink;

import org.firstinspires.ftc.teamcode.module.Input;

import java.util.Hashtable;

public class MechanimManualController extends DrinkObject {
	
	public Hashtable<String, Object> Pipe(Hashtable<String, Object> input) {
		
		Hashtable<String, Object> output = input;
		
		float drive = Input.Singleton.getAxis("Vertical");
		float strafe = Input.Singleton.getAxis("Horizontal");
		float rotate = Input.Singleton.getAxis("Rotation");
		float reducedSpeed = Input.Singleton.getButton("Slow") ? 0.4f : 1f;
		
		output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
		output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
		output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
		output.put("motorLFOutput", reducedSpeed * (drive + strafe + rotate));
		
		return output;
		
	}
	
}
