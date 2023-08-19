package frc.robot.commands;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends CommandBase {
    private final Intake intake;

    private final double pivotSpeed = 0.025;

    PS4Controller PS4Cont = new PS4Controller(0);

    public IntakeCommand(Intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    
    @Override
    public void execute() {
        // Move the intake if the square button is pressed
        intake.setPivotSpeed(PS4Cont.getSquareButton() ? pivotSpeed : 0);
    }
    
}
