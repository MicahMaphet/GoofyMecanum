package frc.robot.commands;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class DriveCommand extends CommandBase {
    private final Drive drive;

    public DriveCommand(Drive drive) {
        this.drive = drive;
        addRequirements(drive);

    }
    @Override
    public void execute() {
        drive.setOpenLoop(0.1, 0.1, 0.1, 0.1);
    }
}
