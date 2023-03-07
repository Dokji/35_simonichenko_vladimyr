package Task02;

 /**
 * The class Resistance
 */ 
public class Resistance {
    private final int current;
    private final int voltage1; 
    private final int voltage2; 
    private final int voltage3; 
    

/** 
 *
 * It is a constructor. 
 *
 * @param current  the current
 * @param voltage1  the voltage1
 * @param voltage2  the voltage2
 * @param voltage3  the voltage3
 */
    public Resistance(int current, int voltage1, int voltage2, int voltage3) { 

        this.current = current;
        this.voltage1 = voltage1;
        this.voltage2 = voltage2;
        this.voltage3 = voltage3;
    }
    

/** 
 *
 * Calculate total resistance
 *
 * @return double
 */
    public double calculateTotalResistance() { 

        double totalVoltage = voltage1 + voltage2 + voltage3;
        return totalVoltage / current;
    }


/** 
 *
 * Gets the octal representation
 *
 * @return the octal representation
 */
    public String getOctalRepresentation() { 

        double resistance = calculateTotalResistance();
        int octalValue = (int) resistance;
        return Integer.toOctalString(octalValue);
    }
    

/** 
 *
 * Gets the hexadecimal representation
 *
 * @return the hexadecimal representation
 */
    public String getHexadecimalRepresentation() { 

        double resistance = calculateTotalResistance();
        int hexValue = (int) resistance;
        return Integer.toHexString(hexValue);
    }

/** 
 *
 * Display shirt information
 *
 */
        public void displayShirtInformation(){ 

        System.out.println("octal representation: " + getOctalRepresentation());
        System.out.println("hexadecimal representation: " + getHexadecimalRepresentation());
}}


