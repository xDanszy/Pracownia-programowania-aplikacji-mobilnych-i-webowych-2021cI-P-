import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);

        scanner.close();
    }
}
