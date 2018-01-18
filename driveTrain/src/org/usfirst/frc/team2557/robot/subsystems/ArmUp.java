package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.ArmCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmUp extends Subsystem {
	
	public void up() {
		RobotMap.arm.set(Robot.m_oi.gamepad1.getRawAxis(2));
	}

	public void down() {
		RobotMap.arm.set(-Robot.m_oi.gamepad1.getRawAxis(3));
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArmCommand());
    }
}

