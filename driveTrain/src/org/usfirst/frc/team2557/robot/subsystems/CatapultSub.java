package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSub extends Subsystem {
	
	public void CatapultDown() {
		RobotMap.Catapult.set(1);
	}
		
	 
	public void CatapultStop() {
		RobotMap.Catapult.set(0);
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

