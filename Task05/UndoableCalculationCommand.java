
package Task04;

public abstract class UndoableCalculationCommand extends UndoableCommand {
    protected final Calculator calculator;
    protected final int operand;

    public UndoableCalculationCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public abstract void execute();

    @Override
    public abstract void undo();
}

