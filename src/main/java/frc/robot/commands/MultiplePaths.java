// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class MultiplePaths extends CommandBase {
  DriveTrain _driveTrain;
  String _gameData;
  private boolean finish;
 
 
  /** Creates a new MultiplePaths. */
  public MultiplePaths(DriveTrain driveTrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    _driveTrain = driveTrain;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    _gameData = DriverStation.getInstance().getGameSpecificMessage();
    finish = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(_gameData.length() > 0) {

      switch(_gameData.charAt(0)) {
        case 'R' :
          RedPath r = new RedPath(_driveTrain);
          r.schedule();
          finish = true;
          
          break;
          case 'B' :
          RedPath b = new RedPath(_driveTrain);
          b.schedule();
          finish = true;
         
          break;
           case 'Y' :
          RedPath y = new RedPath(_driveTrain);
          y.schedule();
          finish = true;
          
          break;
          default :

          break;
      }
    }

    else{

    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return finish;
  }
}
