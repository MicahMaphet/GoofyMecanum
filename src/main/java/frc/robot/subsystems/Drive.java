package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase{
    private final CANSparkMax frontLeftSpark;
    private final CANSparkMax frontRightSpark;
    private final CANSparkMax backLeftSpark;
    private final CANSparkMax backRightSpark;
    public Drive() {
        frontRightSpark = new CANSparkMax(1, MotorType.kBrushless);
        frontLeftSpark = new CANSparkMax(4, MotorType.kBrushless);
        backRightSpark = new CANSparkMax(2, MotorType.kBrushless);
        backLeftSpark = new CANSparkMax(3, MotorType.kBrushless);

        frontLeftSpark.restoreFactoryDefaults();
        frontRightSpark.restoreFactoryDefaults();
        backLeftSpark.restoreFactoryDefaults();
        backRightSpark.restoreFactoryDefaults();

        // Invert the right wheeles
        frontRightSpark.setInverted(true);
        backRightSpark.setInverted(true);
    
    }   


    @Override
    public void periodic() {
    }

    public void setOpenLoop(double flSpeed, double frSpeed, double blSpeed, double brSpeed) {
        frontRightSpark.set(frSpeed);
        frontLeftSpark.set(flSpeed);
        backRightSpark.set(brSpeed);
        backLeftSpark.set(blSpeed);
    }
}
