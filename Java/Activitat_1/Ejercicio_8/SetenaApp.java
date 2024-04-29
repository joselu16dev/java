package Ejercicio_8;
import java.util.Scanner;
public class SetenaApp {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introdueix tres notes separades por un espai: ");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();
    double mitjanaNotes = (num1+num2+num3)/3;
    System.out.println("La teva mitjana de notes es: " + mitjanaNotes );
    scanner.close();
}   
}
