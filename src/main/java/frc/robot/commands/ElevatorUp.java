package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Elevator;

public class ElevatorUp extends CommandBase{

    private final Elevator m_elevator;
    
    public ElevatorUp(Elevator subsystem) {
        m_elevator = subsystem;
        addRequirements(m_elevator);
    }
        
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        m_elevator.up();
    }
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }
    
}
