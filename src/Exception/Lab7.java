package Exception;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            if(x==0){
                throw new ArithmeticException("Enter non zero no");
            }
            int a = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

    }
}
