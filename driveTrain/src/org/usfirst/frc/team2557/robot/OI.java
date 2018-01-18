/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2557.robot;

import org.usfirst.frc.team2557.robot.commands.CatapultCommand;
import org.usfirst.frc.team2557.robot.commands.IntakeCommand;
import org.usfirst.frc.team2557.robot.commands.OuttakeCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	public Joystick gamepad1;
	
	public JoystickButton LB;
	public JoystickButton RB;
	public JoystickButton X;
	
	
	
	public OI() {
		gamepad1 = new Joystick(0);
		LB = new JoystickButton(gamepad1, 5);
		RB = new JoystickButton(gamepad1, 6);
		X = new JoystickButton(gamepad1, 3);
		
		
		LB.whileHeld(new IntakeCommand());
		RB.whileHeld(new OuttakeCommand());
		X.whileHeld(new CatapultCommand());
	}
	
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
