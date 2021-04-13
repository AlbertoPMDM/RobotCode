package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class InvertDrive extends CommandBase {

    private final Drive m_drive;

    public InvertDrive(Drive subsystem) {
        m_drive = subsystem;
        addRequirements(m_drive);
    }
    
    @Override
    public void initialize() {
        m_drive.toggleDirection();
    }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}