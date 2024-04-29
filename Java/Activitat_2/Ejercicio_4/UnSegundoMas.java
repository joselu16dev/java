package Activitat_2.Ejercicio_4;

import java.util.Scanner;
public class UnSegundoMas {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Introdueix un hora en format Hor:min:seg ");
      String hora = scanner.nextLine();
      String[] partesHora = hora.split(":");
      int horas = Integer.parseInt(partesHora[0]);
      int minutos = Integer.parseInt(partesHora[1]);
      int segundos = Integer.parseInt(partesHora[2]);

      segundos++;

      if (segundos == 60) {
        segundos = 0;
        minutos++;
      }if (minutos == 60) {
        minutos = 0;
        horas++;
      }if (horas == 24) {
        horas = 0;
      }
      String horaMasUnSegundo = String.format("%02d:%02d:%02d", horas, minutos, segundos);
      System.out.println("La nueva hora sumada es: " + horaMasUnSegundo);
      scanner.close();

    }
}
