import java.util.Scanner;

public class Zadanie2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość choinki: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
