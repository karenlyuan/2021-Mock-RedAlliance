// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class TankDrive extends CommandBase {
  DriveTrain _driveTrain;
  Joystick _rightJoystick;
  Joystick _leftJoystick;
  /** Creates a new TankDrive. */
  public TankDrive(DriveTrain driveTrain, Joystick lJoystick, Joystick rJoystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    _driveTrain = driveTrain;
    _leftJoystick = lJoystick;
    _rightJoystick = rJoystick;

    addRequirements(_driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  _driveTrain.tankDrive(-0.8 * _leftJoystick.getRawAxis(1),
                          -0.8 * _rightJoystick.getRawAxis(1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
