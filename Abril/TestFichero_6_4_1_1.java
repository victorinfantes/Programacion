package Abril;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFichero_6_4_1_1 {
    public static void main(String[] args) {
        FileOutputStream f = null;
        String s = "En un lugar de la mancha de cuyo nombre no quiero acordarme";
        char c = 0;
        try {
            f = new FileOutputStream("datos.txt");
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                f.write((byte) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
