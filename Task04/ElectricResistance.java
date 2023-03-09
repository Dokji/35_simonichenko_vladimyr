package Task04;


import java.io.Serializable;

public class ElectricResistance implements Serializable {
    private static final long serialVersionUID = 1L;
    private final double voltage1;
    private final double voltage2;
    private final double voltage3;
    private final double current;
    private final double resistance;
    
    public ElectricResistance(double v1, double v2, double v3, double i) {
        voltage1 = v1;
        voltage2 = v2;
        voltage3 = v3;
        current = i;
        resistance = (voltage1 + voltage2 + voltage3) / current;
    }
    
    public double getResistance() {
        return resistance;
    }
    public double calculateTotalResistance() { 

        double totalVoltage = voltage1 + voltage2 + voltage3;
        return totalVoltage / current;
    }

    /**
     *
     * @return
     */
    public String getHexadecimalRepresentation() { 

        double resistance = calculateTotalResistance();
        int hexValue = (int) resistance;
        return Integer.toHexString(hexValue);
    }
}

