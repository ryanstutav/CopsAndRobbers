// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Stopper;

public class StopperUp extends Command {

  private Stopper m_Stopper;

  /** Creates a new StopperUp. */
  public StopperUp(Stopper stop) {
    m_Stopper = stop;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_Stopper);
   
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_Stopper.getPosition() < 0.05) {
       m_Stopper.stopperSpeed(.15);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Stopper.stopperSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    
    if (m_Stopper.getPosition() >= 0.05) {
       return true;
    } 

    return false;

  }
}