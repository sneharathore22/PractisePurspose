package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab2 {
    public static void main(String[] args) {
        String path = "c://a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            } catch ( Exception e) {
            System.out.println("FNE");
        }
    }
}
