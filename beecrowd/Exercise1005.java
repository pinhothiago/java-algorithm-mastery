import java.util.Scanner;

public class Exercise1005 {

    public static void main(String[] args) {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        double media = (a * (3.5) + b * (7.5)) / 11;

        System.out.println("MEDIA = " + String.format("%.5f", media));
    }

}
