/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2557.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
//Step 1: declare motors, then speed controller groups, then drive
//Step 2: initiate motors, group, drive
public class RobotMap {	
	public static WPI_TalonSRX Arm1;
	public static WPI_TalonSRX Arm2;
	public static WPI_TalonSRX Catapult;
	
	public static WPI_TalonSRX intakeMotor;
	public static WPI_TalonSRX thing1;
	public static WPI_TalonSRX thing2;
	public static WPI_TalonSRX thing3;
	public static WPI_TalonSRX thing4;
	
	public static SpeedControllerGroup arm;
	public static SpeedControllerGroup Left;
	public static SpeedControllerGroup Right;
	
	public static DifferentialDrive Drive;
	
	public static void init() {
		Arm2 = new WPI_TalonSRX(3);
		Arm1 = new WPI_TalonSRX(2);
		
		Catapult = new WPI_TalonSRX(1);
		
		intakeMotor = new WPI_TalonSRX(4);
		
		thing1 = new WPI_TalonSRX(7);
		thing2 = new WPI_TalonSRX(6);
		thing3 = new WPI_TalonSRX(8);
		thing4 = new WPI_TalonSRX(5);

		arm = new SpeedControllerGroup(Arm1, Arm2);
		Left = new SpeedControllerGroup(thing1,thing2);
		Right = new SpeedControllerGroup(thing3,thing4);
		
		Drive = new DifferentialDrive(Left,Right);
		
		Drive.setSafetyEnabled(false);
	}
	
}
