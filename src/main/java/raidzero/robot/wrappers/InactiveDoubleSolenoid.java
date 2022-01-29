package raidzero.robot.wrappers;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class InactiveDoubleSolenoid extends DoubleSolenoid {
    
    protected boolean active = true;

    public InactiveDoubleSolenoid(PneumaticsModuleType moduleType, final int forwardChannel, final int reverseChannel) {
        super(moduleType, forwardChannel, reverseChannel);
    }
 
    public void setActive(boolean state) {
        active = state;
    }
  
    @Override
    public void set(Value value) {
        if (!active) {
            return;
        }
        super.set(value);
    }
}