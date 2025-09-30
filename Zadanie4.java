import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój dochód: ");
        double dochod = scanner.nextDouble();
        double podatek;

        if (dochod <= 85528) {
            podatek = 0.18 * dochod - 556.02;
        } else {
            podatek = 14839.02 + 0.32 * (dochod - 85528);
        }

        if (podatek < 0) podatek = 0;

        System.out.printf("Należny podatek: %.2f PLN\n", podatek);

        scanner.close();
    }
}
