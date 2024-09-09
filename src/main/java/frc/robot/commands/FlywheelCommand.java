// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Flywheels;

public class FlywheelCommand extends Command {
 
  public Flywheels m_flywheels;

  /** Creates a new FlywheelCommand. */
  public FlywheelCommand(Flywheels fly) {
    m_flywheels = fly;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_flywheels);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_flywheels.spin(0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_flywheels.spin(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}