package Ejercicio_7;
import java.time.Year;
import java.util.Scanner;

public class SisenaApp {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("A quin any vas neixer? ");
    int any = scanner.nextInt();
    Year year = Year.now();
    int anyActual = year.getValue();
    int edat = anyActual - any;
    System.out.println("Tens " + edat + " anys");
    scanner.close();


    }
}
