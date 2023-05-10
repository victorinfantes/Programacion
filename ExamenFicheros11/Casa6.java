package ExamenFicheros11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Casa6 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for (int i = 0; i < 501; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
            bw.close();

        }catch (IOException e) {
            e.getStackTrace();
        }

    }

    private static boolean esPrimo(int primo) {
        for (int i = 2; i < primo; i++) {
            if ((primo % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
