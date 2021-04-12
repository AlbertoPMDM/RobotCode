package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Drive extends SubsystemBase {

    private final SpeedControllerGroup m_leftMotors = new SpeedControllerGroup(
        new WPI_TalonSRX(DriveConstants.TALONSRX_LEFT_1), 
        new WPI_TalonSRX(DriveConstants.TALONSRX_LEFT_2));

    private final SpeedControllerGroup m_rightMotors = new SpeedControllerGroup(
        new WPI_TalonSRX(DriveConstants.TALONSRX_RIGHT_1), 
        new WPI_TalonSRX(DriveConstants.TALONSRX_RIGHT_2));

    private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

    public Drive(){

    }
    
    public void tankDrive(double leftSpeed, double rightSpeed){
        m_drive.tankDrive(leftSpeed, rightSpeed);
    }

    @Override
    public void periodic() {
        // TODO Auto-generated method stub
        super.periodic();
    }
}