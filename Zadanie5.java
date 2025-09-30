import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cena;
        int liczbaRat;

        while (true) {
            System.out.print("Podaj cenę towaru (100 - 10000): ");
            cena = scanner.nextDouble();

            System.out.print("Podaj liczbę rat (6 - 48): ");
            liczbaRat = scanner.nextInt();

            if (cena >= 100 && cena <= 10000 && liczbaRat >= 6 && liczbaRat <= 48) {
                break;
            } else {
                System.out.println("Błędne dane, spróbuj ponownie.");
            }
        }

        double oprocentowanie;
        if (liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }

        double kwotaZRata = cena * (1 + oprocentowanie);
        double rata = kwotaZRata / liczbaRat;

        System.out.printf("Miesięczna rata: %.2f PLN\n", rata);

        scanner.close();
    }
}
