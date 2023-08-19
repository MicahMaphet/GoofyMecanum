package frc.robot.commands;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.Drive;


public class DriveCommand extends CommandBase {
    private final Drive drive;

    float rightWheelSpeed = 0.1f;

    PS4Controller PS4Cont = new PS4Controller(0);
    
    public DriveCommand(Drive drive) {
        this.drive = drive;
        addRequirements(drive);

    }
    @Override
    public void execute() {
        rightWheelSpeed = PS4Cont.getSquareButton() ? 0.1f : 0;
        drive.setOpenLoop(0, 0, rightWheelSpeed, 0);
    }
}
