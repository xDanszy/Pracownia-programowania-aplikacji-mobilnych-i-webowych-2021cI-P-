import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();
        int potega = 1;
        while (potega <= n) {
            System.out.println(potega);
            potega *= 2;
        }
        scanner.close();
    }
}
