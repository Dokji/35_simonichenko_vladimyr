package Task03;

/**
 *
 * @author LENOVO
 */
public class SimpleTextResultPrinter implements ResultPrinter {
    public void print(ResistanceResult result) {
        System.out.println("Resistance calculation results:");
        System.out.printf("Total resistance: %.2f ohms\n", result.getTotalResistance());
        System.out.printf("Resistance of conductor 1: %.2f ohms\n", result.getResistance1());
        System.out.printf("Resistance of conductor 2: %.2f ohms\n", result.getResistance2());
        System.out.printf("Resistance of conductor 3: %.2f ohms\n", result.getResistance3());
    }
}


