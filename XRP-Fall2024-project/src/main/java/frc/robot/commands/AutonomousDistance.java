// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain,Arm arm) {
    addCommands(
        new DriveDistance(0.7, 48, drivetrain),
        new TurnDegrees(0.7, 85, drivetrain),
        new InstantCommand(() -> arm.setAngle(90.0), arm),
        new DriveDistance(0.7, 38, drivetrain),
        new TurnDegrees(0.7, 80, drivetrain),
        new InstantCommand(() -> arm.setAngle(-90.0), arm),
        new DriveDistance(0.7, 48, drivetrain),
        new TurnDegrees(0.7, 80, drivetrain),
        new DriveDistance(0.7, 20, drivetrain),
        new InstantCommand(() -> arm.setAngle(45.0), arm));
        
        
  }
}
