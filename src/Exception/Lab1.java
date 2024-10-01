package Exception;

public class Lab1 {
                            // Exception Passing Concept //
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBound");
        }finally {

            System.out.println("End of the program");
        }
    }
}
