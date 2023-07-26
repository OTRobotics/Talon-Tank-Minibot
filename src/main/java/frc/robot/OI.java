/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
/**
 * Add your docs here
 */
public class OI {

    public static XboxController Driver = new XboxController(0);

    public static double getSpeed () {
        return Driver.getLeftTriggerAxis() * 0.5 - Driver.getRightTriggerAxis() * 0.5;
    }

    public static double getTurn () {
        return Driver.getRawAxis(0);
    }

    public static boolean getSlow () {
        return Driver.getXButton();
    }

}
