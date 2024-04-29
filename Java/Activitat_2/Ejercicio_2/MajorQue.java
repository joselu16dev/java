package Activitat_2.Ejercicio_2;
import java.util.Scanner;

public class MajorQue {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix tres numeros: ");        
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        

        
        int mayor = Math.max(numA, Math.max(numB, numC));
        int menor = Math.min(numA, Math.min(numB, numC));
        int medio = numA + numB + numC - mayor - menor;
        
        System.out.println("Els teus numero ordenats son " + mayor +" "+ medio +" " + menor);
        scanner.close();

    }
}
