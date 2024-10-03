package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab5 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(48);
        marks.add(78);
        marks.add(82);
        marks.add(99);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);
    }
}
