import java.util.Scanner;

public class Zadanie2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        System.out.print("Dzielniki: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
