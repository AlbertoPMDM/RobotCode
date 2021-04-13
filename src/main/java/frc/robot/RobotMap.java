package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.PowerDistributionPanel;

class RobotMap {

    // INITIALIZE PDP
    public static PowerDistributionPanel pdp;

    //////////////////////////////// DRIVE ////////////////////////////////

    // INITIALIZE TALONS

    public static WPI_TalonSRX MAIN_RIGHT_DRIVE;
    public static WPI_TalonSRX MAIN_LEFT_DRIVE;
    public static WPI_TalonSRX SUB_LEFT_DRIVE;
    public static WPI_TalonSRX SUB_RIGHT_DRIVE;

    ////////////////////////////////// ELEVATOR //////////////////////////////////////////

    // INITIALIZE TALONS

    public static WPI_TalonSRX ELEVATOR;

    ///////////////////////////////////// SHOOTER //////////////////////////////////

    // INIT TALONS

    public static WPI_TalonSRX SHOOTER;

    /////////////////////////////////////// YAW ///////////////////////////////////

    // INIT TALONS

    public static WPI_TalonSRX YAW;

    ////////////////////////////////////// PITCH ////////////////////////////////////////

    // INIT TALONS

    public static WPI_TalonSRX PITCH;


    public static void init(){

        ////////////////////////////////////////////////////// DRIVE /////////////////////////////////////////////////////////////
 
        //  CREATE NEW INSTANCES OF ALL DRIVES
        MAIN_LEFT_DRIVE = new WPI_TalonSRX(Constants.DriveConstants.TALONSRX_MOTOR_LEFT_1);
        MAIN_RIGHT_DRIVE =  new WPI_TalonSRX(Constants.DriveConstants.TALONSRX_MOTOR_RIGHT_1);

        SUB_LEFT_DRIVE = new WPI_TalonSRX(Constants.DriveConstants.TALONSRX_MOTOR_LEFT_2);
        SUB_RIGHT_DRIVE = new WPI_TalonSRX(Constants.DriveConstants.TALONSRX_MOTOR_RIGHT_2);

        // SET THE POLARITY (ONE PAIR MUST BE INVERTED)
        MAIN_RIGHT_DRIVE.setInverted(true);
        SUB_RIGHT_DRIVE.setInverted(true);

        MAIN_LEFT_DRIVE.setInverted(false);
        SUB_LEFT_DRIVE.setInverted(false);

        // SET BEHAVIOUR WHEN IN NEUTRAL MODE (NEUTRAL DEADBAND, DEFAULT 4%)
        // SET IN COAST SO IT MOVES FREELY
        MAIN_RIGHT_DRIVE.setNeutralMode(NeutralMode.Coast);
        SUB_RIGHT_DRIVE.setNeutralMode(NeutralMode.Coast);

        MAIN_LEFT_DRIVE.setNeutralMode(NeutralMode.Coast);
        SUB_LEFT_DRIVE.setNeutralMode(NeutralMode.Coast);

        // SET THE RAMP TO GO FROM NEUTRAL TO THE SPEED IN A DETERMINATED AMMOUNT OF TIME
        MAIN_RIGHT_DRIVE.configOpenloopRamp(Constants.DriveConstants.DRIVE_RAMP_TIME, 20);
        SUB_RIGHT_DRIVE.configOpenloopRamp(Constants.DriveConstants.DRIVE_RAMP_TIME, 20);

        MAIN_LEFT_DRIVE.configOpenloopRamp(Constants.DriveConstants.DRIVE_RAMP_TIME, 20);
        SUB_LEFT_DRIVE.configOpenloopRamp(Constants.DriveConstants.DRIVE_RAMP_TIME, 20);

        // SET THE CONTROL MODE OF THE DRIVES
        MAIN_RIGHT_DRIVE.set(ControlMode.PercentOutput, 0);
        MAIN_LEFT_DRIVE.set(ControlMode.PercentOutput, 0);
        
        // SET A PAIR OF MOTORS AS FOLLOWERS FOR CONSISTENCY, AS THE MECHANISM DEPENDS ON TWO MOTORS
        SUB_RIGHT_DRIVE.follow(MAIN_RIGHT_DRIVE);
        SUB_LEFT_DRIVE.follow(MAIN_LEFT_DRIVE);

        ////////////////////////////////////////////////// ELEVATOR //////////////////////////////////////////////

        ELEVATOR = new WPI_TalonSRX(Constants.ElevatorConstants.TALONSRX_ELEVATOR);
        ELEVATOR.setNeutralMode(NeutralMode.Brake);
        ELEVATOR.configOpenloopRamp(Constants.ElevatorConstants.RAMP, 20);
        ELEVATOR.set(ControlMode.PercentOutput, 0);

        ///////////////////////////////////////////////// SHOOTER ///////////////////////////////////////

        SHOOTER = new WPI_TalonSRX(Constants.ShooterConstants.TALONSRX_SHOOTER);
        SHOOTER.setNeutralMode(NeutralMode.Brake);
        SHOOTER.configOpenloopRamp(Constants.ShooterConstants.RAMP, 20);
        SHOOTER.set(ControlMode.PercentOutput, 0);

        //////////////////////////////////////////////////// YAW ///////////////////////////////////////////

        YAW = new WPI_TalonSRX(Constants.YawConstants.TALONSRX_YAW);
        YAW.setNeutralMode(NeutralMode.Brake);
        YAW.configOpenloopRamp(Constants.YawConstants.RAMP, 20);
        YAW.set(ControlMode.PercentOutput, 0);

        ////////////////////////////////////////////////// PITCH /////////////////////////////////////////////

        PITCH = new WPI_TalonSRX(Constants.PitchConstants.TALONSRX_PITCH);
        PITCH.setNeutralMode(NeutralMode.Brake);
        PITCH.configOpenloopRamp(Constants.PitchConstants.RAMP, 20);
        PITCH.set(ControlMode.PercentOutput, 0);
    }
}