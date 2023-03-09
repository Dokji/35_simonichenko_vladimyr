package Task04;

import java.io.*;

public class ElectricResistanceTest {
    
    public void testElectricResistance() {
        ElectricResistance er = new ElectricResistance(10, 20, 30, 2.5);
        
        // перевірка результату обчислень
        assertEquals(24.0, er.getResistance(), 0.0001);
        
        // перевірка серіалізації та десеріалізації
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(out)) {
            oos.writeObject(er);
            byte[] bytes = out.toByteArray();
            try (ByteArrayInputStream in = new ByteArrayInputStream(bytes);
                 ObjectInputStream ois = new ObjectInputStream(in)) {
                ElectricResistance er2 = (ElectricResistance)ois.readObject();
                assertEquals(er.getResistance(), er2.getResistance(), 0.0001);
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    private void assertEquals(double d, double resistance, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}