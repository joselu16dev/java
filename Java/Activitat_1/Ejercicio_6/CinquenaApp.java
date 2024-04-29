package Ejercicio_6;

import java.util.Scanner;

public class CinquenaApp {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("introdueix un numero: ");
    int n = scanner.nextInt();
    if (n%2 == 0 && n%5 == 0) {
      System.out.println("El numero " + n + " es par i multiple de cinc");  
    } else {
        System.out.println("El numero " + n + " no es par ni multiple de cinc");
    }
    scanner.close();

    }
    
}
