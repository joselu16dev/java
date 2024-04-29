package Activitat_2.Ejercicio_3;
import java.util.Scanner;
public class Qualificacio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix la teva qualificacio: ");
        float nota = scanner.nextFloat();
        String mensaje;
        if (nota <= 4) {
            mensaje = "La teva nota " + nota + " es: Insuficient";

        }else if (nota >= 5 && nota < 6) {
            mensaje = "La teva nota " + nota + " es: Abel";
        }else if (nota >= 6 && nota < 7) {
            mensaje = "La teva nota " + nota + " es: Be";
        }else if (nota >= 7 && nota <= 8) {
            mensaje = "La teva nota " + nota + " es: Notable";
        }else {
            mensaje = "La teva nota " + nota + " es: Excel·lent";
        }
        System.out.println(mensaje);
        scanner.close();
    }
}
