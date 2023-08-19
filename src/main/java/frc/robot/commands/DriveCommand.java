package frc.robot.commands;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.Drive;


public class DriveCommand extends CommandBase {
    private final Drive drive;

    float driveSpeed = 0.3f; // Back right wheel speed
    // instantiate the PS4 Controller
    PS4Controller PS4Cont = new PS4Controller(0);
    
    public DriveCommand(Drive drive) {
        this.drive = drive;
        addRequirements(drive);

    }
    @Override
    public void execute() {
        drive.setOpenLoop(PS4Cont.getLeftY() * driveSpeed,
                          PS4Cont.getRightY() * driveSpeed,
                          PS4Cont.getLeftY() * driveSpeed,
                          PS4Cont.getRightY() * driveSpeed);
    }
}
