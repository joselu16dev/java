package Ejercicio_3;
import java.util.Scanner;

public class SegonaApp {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe un mensaje: ");
    String mensaje = scanner.nextLine();
    System.out.println(("Mensaje ingresado: " + mensaje));
    scanner.close();
}
}