import java.util.Scanner;

public class Exercise1004 {

    public static void main(String[] args) {
        int a;
        int b;

        int prod;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);
    }
}
