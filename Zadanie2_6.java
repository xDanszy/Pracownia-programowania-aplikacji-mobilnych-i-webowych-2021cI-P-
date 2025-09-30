import java.util.Scanner;
import java.util.Random;

public class Zadanie2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int liczba = rand.nextInt(100) + 1;
        int strzal;
        do {
            System.out.print("Zgadnij liczbę (1-100): ");
            strzal = scanner.nextInt();
            if (strzal > liczba) {
                System.out.println("Podałeś za dużą wartość");
            } else if (strzal < liczba) {
                System.out.println("Podałeś za małą wartość");
            } else {
                System.out.println("Gratulacje!");
            }
        } while (strzal != liczba);
        scanner.close();
    }
}
