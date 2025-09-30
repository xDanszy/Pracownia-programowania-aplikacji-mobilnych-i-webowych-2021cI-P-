import java.util.Scanner;

public class Zadanie2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Podaj liczbę (0 kończy): ");
            int x = scanner.nextInt();
            if (x == 0) break;
            suma += x;
        }
        System.out.println("Suma: " + suma);
        scanner.close();
    }
}
