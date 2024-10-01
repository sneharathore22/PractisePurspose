package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab3 {
    public static void main(String[] args) throws FileNotFoundException,ArithmeticException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException,ArithmeticException {
        System.out.println("Hi");
        String path = "C:\\Users\\HP\\IdeaProjects\\Practise Purspose";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        System.out.println("EOP");

    }
}

