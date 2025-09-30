import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 1.8 * celsius + 32.0;
        System.out.println("Temperatura w stopniach Fahrenheita: " + fahrenheit);

        scanner.close();
    }
}
