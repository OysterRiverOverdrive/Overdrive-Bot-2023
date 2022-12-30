// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static int LeftDrive1 = 1;
    public static int LeftDrive2 = 2;
    public static int RightDrive1 = 3;
    public static int RightDrive2 = 4;
    // establishing motor callouts and their CAN-IDs

    public static double SLEWTURN = 4.5;
    public static double SLEWSPEED = 2.2;
    public static double SPEEDLIMIT_TURN = 0.75;
    public static double SPEEDLIMIT_SPEED = 0.95;


    // Driver Controller configuraton (Xbox Pro)
    public static int DRIVER_ONE_PORT = 0;
    public static int DRIVER_SEC_PORT = 0;
    public static boolean DRIVER_W_BUTTONS = false;//Work in progress, Don't touch please
    public static boolean arcadedriver = true;
    public static int DRIVER_TURN = 5;
    public static int DRIVER_SPEED = 2;


    // Operator Controller Configuration (Logitech Dual Action)
    public static int OPER_PORT = 3;
    

}
