package Activitat_2.Ejercicio_1;

import java.util.Scanner;

public class QuasiZero {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introdueix un numero: ");
       double num = scanner.nextDouble();
       if (num < 1 && num > 0) {
        System.out.println("El num " + num + " es quasi zero");
       } else {
        System.out.println("El num " + num + " no es quasi zero");
       }
    scanner.close();


    }
}
