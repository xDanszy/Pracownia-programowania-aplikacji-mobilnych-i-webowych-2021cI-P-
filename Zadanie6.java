import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator: +, -, *, /");

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        switch (operacja) {
            case '+':
                System.out.println("Wynik: " + (a + b));
                break;
            case '-':
                System.out.println("Wynik: " + (a - b));
                break;
            case '*':
                System.out.println("Wynik: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Wynik: " + (a / b));
                } else {
                    System.out.println("Błąd: Dzielenie przez zero!");
                }
                break;
            default:
                System.out.println("Nieznany symbol operacji.");
        }

        System.out.println("Naciśnij Enter aby zakończyć...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
