package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final CANSparkMax intakeVerticlePivot = new CANSparkMax(7, MotorType.kBrushless);
    private double direction = 0;

    public Intake() {

    }

    public void setDirection(double verticleDirection) {
        intakeVerticlePivot.set((verticleDirection - direction) * 0.1);
    }
    
}
