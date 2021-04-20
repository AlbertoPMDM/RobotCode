package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class Elevator extends SubsystemBase{

    public static SpeedController m_elevator = new WPI_TalonSRX(ElevatorConstants.TALONSRX_ELEVATOR);

    public Ultrasonic m_elevatorSensor = new Ultrasonic(
        ElevatorConstants.ULTRASONIC_ELEVATOR[0], 
        ElevatorConstants.ULTRASONIC_ELEVATOR[1]);

    public Elevator(){
        m_elevatorSensor.setAutomaticMode(true);
    }

    public double readSensor(){
        System.out.println(m_elevatorSensor.getRangeInches());
        return m_elevatorSensor.getRangeInches();
    }

    public void up(){
        if (readSensor()>10.0){
            m_elevator.set(0.5);
        }
        else{
            m_elevator.set(0.0);
        }
    }

    public void down(){
        m_elevator.set(-0.5);
    }
}
