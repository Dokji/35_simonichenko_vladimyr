package Task04;

import java.util.ArrayList;

public class CalculationManager {
    private final ArrayList<UndoableCommand> undoableCommands;

    public CalculationManager() {
        undoableCommands = new ArrayList<>();
    }

    public CalculationResult calculateResistance(double r1, double r2, double r3) {
        ElectricalResistance electricalResistance = new ElectricalResistance(r1, r2, r3);
        double totalResistance = electricalResistance.getTotalResistance(1.0);
        CalculationResult result = new CalculationResult(totalResistance);
        return result;
    }

    public void undoLastCommand() {
        if (!undoableCommands.isEmpty()) {
            UndoableCommand command = undoableCommands.remove(undoableCommands.size() - 1);
            command.undo();
        }
    }
}

