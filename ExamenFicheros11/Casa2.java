package ExamenFicheros11;

import java.io.*;

public class Casa2 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        DataInputStream bus = null;

        try {
            fis = new FileInputStream("datos.dat");
            bus = new DataInputStream(fis);

            while (true) {
                System.out.println(bus.readInt());
            }
        }catch (FileNotFoundException f) {
            f.printStackTrace();
        }
        catch (EOFException eof) {
            System.out.println(eof.getMessage());
        } catch (IOException e) {
            e.getStackTrace();
        }
        finally {
            try {
                if (fis!=null) {
                    fis.close();
                }
                if (bus!=null) {
                    bus.close();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
        }

    }
}
