import java.util.Scanner;

public class Zadanie2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę > 1: ");
        int n = scanner.nextInt();
        boolean pierwsza = true;
        if (n <= 1) pierwsza = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    pierwsza = false;
                    break;
                }
            }
        }
        if (pierwsza) System.out.println("Liczba pierwsza");
        else System.out.println("Liczba nie jest pierwsza");
        scanner.close();
    }
}
