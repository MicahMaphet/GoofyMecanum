package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final CANSparkMax intakeVerticlePivot;
    
    private double verticleOrientation;

    public Intake() {
        intakeVerticlePivot = new CANSparkMax(7, MotorType.kBrushless);
    }

    /*
     * Sets the speed of the intake verticle pivot.
     * This is only going to be used to test the intake, I will switch it to direction
     * after I test this.
     */
    public void setPivotSpeed(double speed) {
        intakeVerticlePivot.set(speed);
    }

    public void ZeroPivot() {
        verticleOrientation = 0;
    }

}
