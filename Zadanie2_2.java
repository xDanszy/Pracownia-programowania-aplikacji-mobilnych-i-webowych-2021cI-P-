import java.util.Scanner;

public class Zadanie2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj A: ");
        int A = scanner.nextInt();
        System.out.print("Podaj B: ");
        int B = scanner.nextInt();

        int suma = 0;
        int i = A;
        while (i <= B) {
            suma += i;
            i++;
        }
        System.out.println(suma);

        suma = 0;
        i = A;
        do {
            suma += i;
            i++;
        } while (i <= B);
        System.out.println(suma);

        suma = 0;
        for (i = A; i <= B; i++) {
            suma += i;
        }
        System.out.println(suma);

        scanner.close();
    }
}
