package Task04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Приклад використання класу ElectricResistance
        ElectricResistance er = new ElectricResistance(10, 20, 30, 2.5);
        System.out.println("Total resistance: " + er.getResistance());
        System.out.println("Hexadecimal representation: " + er.getHexadecimalRepresentation());

        // Приклад використання класу ElectricResistance для серіалізації та десеріалізації об'єкта
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("electric_resistance.ser"))) {
            out.writeObject(er);
        } catch (IOException e) {
            System.out.println("Error serializing ElectricResistance: " + e.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("electric_resistance.ser"))) {
            ElectricResistance er2 = (ElectricResistance)in.readObject();
            System.out.println("Deserialized ElectricResistance: " + er2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing ElectricResistance: " + e.getMessage());
        }
    }
}
   
