
package Task04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculationManager calculationManager = new CalculationManager();

        while (true) {
            System.out.println("Enter the values for each conductor (separated by spaces):");
            double r1 = scanner.nextDouble();
            double r2 = scanner.nextDouble();
            double r3 = scanner.nextDouble();

            CalculationResult result = calculationManager.calculateResistance(r1, r2, r3);

            System.out.println("Enter 't' for text output, 'tab' for table output, or 'q' to quit:");
            String outputFormat = scanner.next();

            if (outputFormat.equals("q")) {
                break;
            }

            FactoryMethod factoryMethod;

            if (outputFormat.equals("tab")) {
                factoryMethod = new TableResultFactory();
            } else {
                factoryMethod = new TextResultFactory();
            }

            ResultFormatter formatter = factoryMethod.createResultFormatter();
            String output = formatter.formatResult(result);

            System.out.println(output);
        }
    }
}

