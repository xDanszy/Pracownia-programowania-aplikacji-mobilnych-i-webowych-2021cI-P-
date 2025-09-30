import java.util.Scanner;

public class Zadanie2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        int suma = 0;
        int sumaParzyste = 0, sumaNieparzyste = 0;
        int countParzyste = 0, countNieparzyste = 0;

        int temp = n;
        while (temp > 0) {
            int cyfra = temp % 10;
            suma += cyfra;
            if (cyfra % 2 == 0) {
                sumaParzyste += cyfra;
                countParzyste++;
            } else {
                sumaNieparzyste += cyfra;
                countNieparzyste++;
            }
            temp /= 10;
        }
        System.out.println("Suma cyfr: " + suma);
        if (countParzyste > 0 && countNieparzyste > 0) {
            double sredniaP = (double)sumaParzyste / countParzyste;
            double sredniaN = (double)sumaNieparzyste / countNieparzyste;
            System.out.println("Stosunek średnich: " + (sredniaP / sredniaN));
        } else {
            System.out.println("Nie można obliczyć stosunku średnich.");
        }
        scanner.close();
    }
}
