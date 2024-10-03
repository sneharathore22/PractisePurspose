package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab4 {
    public static void main(String[] args) {

        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Akash");
        mylist.add("Kiran");
        mylist.add("Pramod");
        mylist.add("Pramod");

        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Pramod");
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
    //    System.out.println(mylist.isEmpty());
            mylist.add("Dutta");
        System.out.println(mylist);
    //    mylist.add(3,"Shuchi");
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);
        System.out.println("- - - -");
        System.out.println(mylist);





    }
}
