import java.util.Scanner;

public class Zadanie2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Podaj liczbę (0 kończy): ");
            int x = scanner.nextInt();
            if (x == 0) break;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            int suma = min + max;
            double srednia = suma / 2.0;
            System.out.println("Suma min i max: " + suma);
            System.out.println("Średnia: " + srednia);
        }
        scanner.close();
    }
}
