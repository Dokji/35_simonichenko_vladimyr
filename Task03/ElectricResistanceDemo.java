package Task03;

import java.io.*;

public class ElectricResistanceDemo {
    public static void main(String[] args) {
        ElectricResistance er = new ElectricResistance(10, 20, 30, 2.5);
        
        // серіалізація
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("electric_resistance.ser"))) {
            out.writeObject(er);
        } catch (IOException e) {
        }
        
        // десеріалізація
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("electric_resistance.ser"))) {
            ElectricResistance er2 = (ElectricResistance)in.readObject();
            System.out.println(er2); // виведе ElectricResistance{voltage1=10.000000, voltage2=20.000000, voltage3=30.000000, current=2.500000, resistance=24.000000}
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}


