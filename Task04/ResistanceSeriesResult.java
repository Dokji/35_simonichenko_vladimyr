package Task04;

/**
 *
 * @author LENOVO
 */
public class ResistanceSeriesResult {
    private final Resistance resistance1;
    private final Resistance resistance2;
    private final double totalResistance;

    public ResistanceSeriesResult(Resistance resistance1, Resistance resistance2) {
        this.resistance1 = resistance1;
        this.resistance2 = resistance2;
        this.totalResistance = resistance1.getResistance() + resistance2.getResistance();
    }

    ResistanceSeriesResult(double[] seriesResistance) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void printTable(int columnWidth) {
        String format = "| %" + columnWidth + "s | %" + columnWidth + "s | %" + columnWidth + "s |%n";
        String separator = "+";
        for (int i = 0; i < columnWidth + 2; i++) {
            separator += "-";
        }
        separator += "+";

        System.out.format(separator + "%n");
        System.out.format(format, "Resistance 1", "Resistance 2", "Total Resistance");
        System.out.format(separator + "%n");
        System.out.format(format, formatResistance(resistance1.getResistance()), formatResistance(resistance2.getResistance()), formatResistance(totalResistance));
        System.out.format(separator + "%n");
    }

    private String formatResistance(double resistance) {
        return String.format("%.2f", resistance);
    }

    String getResult() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

