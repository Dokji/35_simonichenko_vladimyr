/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task04;

import java.text.DecimalFormat;

public class ResultFormatter {
    
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
    
    public String formatResult(CalculationResult result) {
        StringBuilder sb = new StringBuilder();
        sb.append("Total resistance: ").append(DECIMAL_FORMAT.format(result.getTotalResistance())).append(" ohms\n");
        sb.append("Resistance in 8-bit format: ").append(Integer.toBinaryString((int) result.getTotalResistance())).append("\n");
        return sb.toString();
    }
}

