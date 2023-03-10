package Task04;

public class CalculationCommand implements Command {
    private final ElectricalResistance electricalResistance;
    private CalculationResult result;

    public CalculationCommand(ElectricalResistance electricalResistance) {
        this.electricalResistance = electricalResistance;
    }

    CalculationCommand(ElectricalResistance electricalResistance, CalculationResult result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void execute() {
        // Виконати обчислення та зберегти результати в об'єкт CalculationResult
        double totalResistance = electricalResistance.getTotalResistance();
        double current = electricalResistance.getCurrent();
        double voltage1 = electricalResistance.getVoltage1();
        double voltage2 = electricalResistance.getVoltage2();
        double voltage3 = electricalResistance.getVoltage3();
        double power1 = voltage1 * current;
        double power2 = voltage2 * current;
        double power3 = voltage3 * current;

        result = new CalculationResult(totalResistance, current, voltage1, voltage2, voltage3, power1, power2, power3);
    }

    public CalculationResult getResult() {
        return result;
    }
}

