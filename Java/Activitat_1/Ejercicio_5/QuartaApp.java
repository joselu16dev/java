package Ejercicio_5;

import java.util.Scanner;



public class QuartaApp {
public static void main(String[] args) {
    
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Posa la temperatura amb Farenheit: ");
    int f = scanner.nextInt();
    int c = (f -32)*5/9;
    System.out.println("La temperatura en Celsius es: " + c+"ºC");
    scanner.close();

}
    
}
