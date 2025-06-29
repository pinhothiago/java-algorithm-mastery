import java.util.Scanner;

public class Exercise1002 {

    public static void main(String[] args) {
        double raio;
        double area;

        Scanner scanner = new Scanner(System.in);

        raio = scanner.nextDouble();

        double pi = 3.14159;

        area = (raio * raio) * pi;
        System.out.println("A=" + String.format("%.4f", area));
    }
}