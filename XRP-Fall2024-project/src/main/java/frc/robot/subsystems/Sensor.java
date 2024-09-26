package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sensor extends SubsystemBase{
    private final AnalogInput m_sensor;
    private boolean print = true;

  /** Creates a new Arm. */
  public Sensor() {
    // Device number 4 maps to the physical Servo 1 port on the XRP
    m_sensor = new AnalogInput(2);
    m_sensor.setOversampleBits(4);
    m_sensor.setAverageBits(4);

  }
    public void getvalue () {
        if (print){
            System.out.println (m_sensor.getValue());
        }
        
        print = !print;
        
  }
    
}
