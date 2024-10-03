package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {

        ArrayList mylist2 = new ArrayList();
        mylist2.add("Vishu");
        mylist2.add("shuchi");
        mylist2.add("Ram");
        mylist2.add("ishu");
        mylist2.add(123);

        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Amit"));
        System.out.println(mylist2.contains("vishnu"));
        String s1 = (String) mylist2.get(1);
        System.out.println(s1);
    }
}
