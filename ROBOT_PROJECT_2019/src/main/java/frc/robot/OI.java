/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.arcadeDrive;
import frc.robot.commands.hatchServoDown;
import frc.robot.commands.hatchServoUp;
import frc.robot.commands.hatchServoCenter;
import frc.robot.commands.cargoIntakeIntake;
import frc.robot.commands.cargoIntakeEject;
import frc.robot.commands.cargoIntakeDoNothing;
import frc.robot.commands.driveStraight;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick logitechLeft;
    private JoystickButton joystickButtonL1;
    private JoystickButton joystickButtonL3;
    private JoystickButton joystickButtonL4;
    private JoystickButton joystickButtonL6;

    public Joystick AC;
    public JoystickButton joystickButtonAC1;
    public JoystickButton joystickButtonAC2;
    public JoystickButton joystickButtonAC3;
    public JoystickButton joystickButtonAC4;
    public JoystickButton joystickButtonAC5;
    public JoystickButton joystickButtonAC6;
    public JoystickButton joystickButtonAC7;
    public JoystickButton joystickButtonAC8;
    public JoystickButton joystickButtonAC9;
    // public String gameData = Robot.ds.getGameSpecificMessage().substring(0, 1);
    public Joystick logitechRight;

    public OI() {
        // new Reset().start();
        // Arcade Controller Buttons
        logitechLeft = new Joystick(0);
        AC = new Joystick(1);
        // logitechRight = new Joystick(2);

        //

        joystickButtonAC1 = new JoystickButton(AC, 1);
        // joystickButton1.whileHeld(new IntakeAdjust(.5));
        
        // Cargo intake at .5 speed
        
        joystickButtonAC2 = new JoystickButton(AC, 2);
        joystickButtonAC2.whileHeld(new cargoIntakeIntake());
        
        joystickButtonAC4 = new JoystickButton(AC, 4);
        // joystickButton4.whileHeld(new IntakeWheel(.25));
        joystickButtonAC5 = new JoystickButton(AC, 5);
        // joystickButton5.whileHeld(new EjectWheel(.75));
        joystickButtonAC7 = new JoystickButton(AC, 6);
        // joystickButton7.whenPressed(new Reset());
        joystickButtonAC8 = new JoystickButton(AC, 8);
        // joystickButton8.whileHeld(new autoBaselineStraight());
        joystickButtonAC9 = new JoystickButton(AC, 9);
        joystickButtonAC9.whenPressed(new driveStraight());

        joystickButtonL1 = new JoystickButton(logitechLeft, 1);
        joystickButtonL3 = new JoystickButton(logitechLeft, 3);
        joystickButtonL4 = new JoystickButton(logitechLeft, 4);
        joystickButtonL6 = new JoystickButton(logitechLeft, 6);
        joystickButtonL1.whileHeld(new arcadeDrive());
        joystickButtonL3.whenPressed(new hatchServoUp());
        joystickButtonL4.whenPressed(new hatchServoCenter());
        joystickButtonL6.whenPressed(new hatchServoDown());

        SmartDashboard.putData("Drive Straight", new driveStraight());
        
        // joystickButton1R = new JoystickButton(logitechRight, 1);
        // joystickButton1R.whileHeld(new elevatorDriveVar());

        // SmartDashboard Buttons
        // SmartDashboard.putData("Base", new autoBaselineStraight());
        // SmartDashboard.putData("Position 1: Left", new autoPos1L());
        // SmartDashboard.putData("Position 1: Right", new autoPos1R());
        // SmartDashboard.putData("Position 2: Left", new autoPos2L());
        // SmartDashboard.putData("Position 2: Right", new autoPos2R());
        // SmartDashboard.putData("Position 3: Left", new autoPos3L());
        // SmartDashboard.putData("Position 3: Right", new autoPos3R());

    }

    public Joystick getlogitechJoy() {
        return logitechLeft;
    }

    public Joystick getlogitechJoy2() {
        return logitechRight;
    }

    public Joystick getarcadeControlller() {
        return AC;
    }

}