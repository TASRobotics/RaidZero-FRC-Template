package raidzero.robot.wrappers;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import raidzero.robot.Constants;

public class InactiveCompressor extends Compressor {

    private static InactiveCompressor instance = null;
    
    private boolean state = true;

    public static InactiveCompressor getInstance() {
        if (instance == null) {
            instance = new InactiveCompressor(Constants.DEFAULT_PNEUMATICS_MODULE_TYPE);
        }
        return instance;
    }

    public InactiveCompressor(PneumaticsModuleType moduleType) {
        super(moduleType);
    }

    public boolean getState() {
        return state;
    }

    public void changeState() {
        state = !state;
        if (state) {
            super.enableDigital();
        } else {
            super.disable();
        }
    }
}