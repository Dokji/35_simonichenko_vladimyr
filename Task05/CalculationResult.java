
package Task04;
import java.io.Serializable;

public class CalculationResult implements Serializable {
    private double totalResistance;

    public CalculationResult(double totalResistance) {
        this.totalResistance = totalResistance;
    }

    CalculationResult(double totalResistance, double current, double voltage1, double voltage2, double voltage3, double power1, double power2, double power3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getTotalResistance() {
        return totalResistance;
    }
}

