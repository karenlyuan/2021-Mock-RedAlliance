// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class BluePath extends SequentialCommandGroup {
  /** Creates a new BluePath. */
  DriveTrain dt;

  public BluePath(DriveTrain dt) {

    this.dt=dt;

    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new Forward(dt, 1, 0.7),
                new Turn(dt, 90, 0.7),
                new Forward(dt, 1, 0.7));
  }
}
