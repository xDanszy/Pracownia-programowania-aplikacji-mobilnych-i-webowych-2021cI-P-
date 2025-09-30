import java.util.Scanner;

public class Zadanie2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
