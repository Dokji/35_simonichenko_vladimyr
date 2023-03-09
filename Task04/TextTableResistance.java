package Task04;

/**
 *
 * @author LENOVO
 */
public class TextTableResistance extends Resistance {

    public TextTableResistance(double[] resistances) {
    }

    public void printTable(int columnWidth, String separator) {
        double totalResistance = getTotalResistance();
        double[] resistances = getResistances();
        int n = resistances.length;

        // Виводимо заголовок таблиці
        System.out.println("|" + String.format("%-" + columnWidth + "s", "Resistance") + separator
                + String.format("%-" + columnWidth + "s", "Voltage") + "|");

        // Виводимо роздільник між заголовком і даними
        for (int i = 0; i < columnWidth * 2 + separator.length() + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Виводимо дані таблиці
        for (int i = 0; i < n; i++) {
            System.out.println("|" + String.format("%-" + columnWidth + ".2f", resistances[i]) + separator
                    + String.format("%-" + columnWidth + ".2f", resistances[i] * getCurrent()) + "|");
        }

        // Виводимо результуючий загальний опір
        System.out.println("Total resistance: " + String.format("%.2f", totalResistance));
    }

    private double getTotalResistance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double[] getResistances() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double getCurrent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void printTable(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

