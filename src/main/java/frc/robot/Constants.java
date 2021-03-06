/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

public final class Constants {

    public static final class DriveConstants{
        // TALON PORTS (AS REPORTED IN TUNER)

        public static final int TALONSRX_MOTOR_LEFT_1 = 0;
        public static final int TALONSRX_MOTOR_LEFT_2 = 1;
        public static final int TALONSRX_MOTOR_RIGHT_1 = 2;
        public static final int TALONSRX_MOTOR_RIGHT_2 = 3;

        // RAMP VALUE

        public static final double DRIVE_RAMP_TIME = 0.5;

       
    }

    public static final class ElevatorConstants {

        // PORTS USED FOR THE ELEVATOR
        public static final int TALONSRX_ELEVATOR = 4;

        //Dio ports for ultrasonic sensors
        public static final int[] ULTRASONIC_ELEVATOR = new int[] {1,2};

        // RAMP
        public static final double RAMP = 0.5;

    }

    public static final class ShooterConstants {

        // PORTS USED FOR THE SHOOTER
        public static final int TALONSRX_SHOOTER = 5;

        // RAMP
        public static final double RAMP = 0.5;

    }

    public static final class YawConstants {

        // PORTS USED FOR THE YAW
        public static final int TALONSRX_YAW = 6;

        // RAMP
        public static final double RAMP = 0.5;
        
    }

    public static final class PitchConstants {

        // PORTS USED FOR THE PITCH
        public static final int TALONSRX_PITCH = 7;
        
        // RAMP
        public static final double RAMP = 0.5;
        

    }

    public static final class OIConstants{
         // JOYSTICK PORTS

         public static final int XBOX_CONTROLLER = 0;
         public static final int SWITCH_BUTTON = 1;


        // elevator buttons

        public static final int ELEVATOR_UP = 3;
        public static final int ELEVATOR_DOWN = 4;
         
    }

}
