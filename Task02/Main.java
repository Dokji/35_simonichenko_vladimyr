package Task02;

import java.io.*;


 /**
 * The class Main
 */ 
public class Main {

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        // створення об'єкту
        ElectricResistance er = new ElectricResistance(10, 20, 30, 2.5);

        // серіалізація об'єкту
        try (FileOutputStream fos = new FileOutputStream("electric_resistance.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(er);
        } catch (IOException e) {
        }

        // десеріалізація об'єкту
        try (FileInputStream fis = new FileInputStream("electric_resistance.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ElectricResistance er2 = (ElectricResistance) ois.readObject();
            System.out.println("octogenarian submission: " + er2.getResistance() + " Om");
            System.out.println("hexadecimal representation: " + er2.getHexadecimalRepresentation() + " Om");
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}


