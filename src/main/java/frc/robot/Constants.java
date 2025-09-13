//This is where all the Constants of the Subsystems/components are going to be located. If any constant is added privately in other object,
//it's not necessary to mention it in this file.



package frc.robot;

//import edu.wpi.first.math.util.Units;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
// Libraries are yet to be used
// import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
// import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.CommandScheduler;
// import edu.wpi.first.*;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;


public class Constants {
    //these are going to be the IDs of the primary drivers
    public static int Mdriver = 1;
    public static int Cdriver = 2;


//THESE ARE THE MOTOR IDS, CHANGE ONCE WE HAVE EVERYTHING TOGETHER
public class MotorConstants {
    public static int X_motor1 = 0;
    public static int X_motor2 = 0;
    public static int X_motor3 = 0;
    public static int X_motor4 = 0;
    public static int Y_motor1 = 0;
    public static int Y_motor2 = 0;
    public static int Y_motor3 = 0;
    public static int Y_motor4 = 0;

    public static int neo_motor = 0;
    public static int neo_motor2 = 0;

}
public static TalonFX TopLeftX = new TalonFX(MotorConstants.X_motor1);
public static TalonFX TopLeftY = new TalonFX(MotorConstants.Y_motor1);

public static TalonFX TopRightX = new TalonFX(MotorConstants.X_motor2);
public static TalonFX TopRightY = new TalonFX(MotorConstants.Y_motor2);

public static TalonFX BottomLeftX = new TalonFX(MotorConstants.X_motor3);
public static TalonFX BottomLeftY = new TalonFX(MotorConstants.Y_motor3);

public static TalonFX BottomRightX = new TalonFX(MotorConstants.X_motor4);
public static TalonFX BottomRightY = new TalonFX(MotorConstants.Y_motor4);

// public final SpeedControllerGroup LeftXSGroup = new SpeedControllers(DriveTrain.TopLeft1,DriveTrain.TopRight1,DriveTrain.BottomRight1,DriveTrain.BottomLeft1);
// public void set_power_leftX(double power){
//     TopRightX.set(power);
//     BottomRightX.set(power);
// }
// public void set_power_rightX(double power){
//     TopLeftX.set(power);
//     BottomLeftX.set(power);
// }
// public void set_power_leftY(double power){
//     TopRightY.set(power);
//     BottomRightY.set(power);
// }
// public void set_power_rightY(double power){
//     TopLeftY.set(power);
//     BottomLeftY.set(power);
// }
// public static TalonFX[] LeftXSGroup = {TopLeftX,BottomLeftX};
// public static TalonFX[] RightXSGroup = {TopRightX,BottomRightX};
//MAKE SURE TO SET THE MOTOR TYPE OF THE NEO MOTORS BEFORE USING, NOT DOING SO MIGHT LEAD TO PERMANENT DAMAGE TO BOTH THE MOTORS AND OUR
//PROGRAMMING DEPARTMENT
public class Elevator {
    SparkMax Left = new SparkMax(MotorConstants.neo_motor, MotorType.kBrushless);
    SparkMax Right = new SparkMax(MotorConstants.neo_motor2, MotorType.kBrushless);

}
public class Arm{

}

}
