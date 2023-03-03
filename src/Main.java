import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            Vehiculo v1 = new Vehiculo("TESLA 361","TESLA",75.5,"DEPORTIVO");
            Vehiculo v2 = new Vehiculo("PEUGOT 420","PEUGOT", 60.0,"4x4");
            Vehiculo v3 = new Vehiculo("CITROEN 309","CITROEN",90.8,"AUTOMATICO");

            ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("texto.txt"));

            oop.writeObject(v1);
            oop.writeObject(v2);
            oop.writeObject(v3);

            oop.close();

            System.out.println("Se han escrito todas las persona");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}