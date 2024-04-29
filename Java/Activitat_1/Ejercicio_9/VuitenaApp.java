package Ejercicio_9;

import java.util.Scanner;

public class VuitenaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix un numero amb decimals: ");
        double num = scanner.nextDouble();
        if (num - Math.floor(num)< 0.50) {
            int numT = (int) Math.floor(num);
            System.out.println("El teu numero truncat es " + numT);
        } else { 
            int numT = (int) Math.ceil(num);
            System.out.println("El teu numero truncat es " + numT);
            }
        scanner.close();
        

    }
}
