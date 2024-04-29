package Activitat_2.Exercici_5;
import java.time.YearMonth;
import java.util.Scanner;

public class CuantosDiasTiene {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el año que quires consultar: ");
    int  añoConsultado = scanner.nextInt();
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Ahora di un numero de mes: ");
    int mesConsultado = scanner2.nextInt();
   

    String mes;
    switch (mesConsultado) {
        case 1:
            mes = "Enero";
            break;
        case 2:
            mes = "Febrero";
            break;
        case 3:
            mes = "Marzo";
            break;
            case 4:
            mes = "Abril";
            break;
            case 5:
            mes = "Mayo";
            break;
            case 6:
            mes = "Junio";
            break;
            case 7:
            mes = "Julio";
            break;
            case 8:
            mes = "Agosto";
            break;
            case 9:
            mes = "Septiembre";
            break;
            case 10:
            mes = "Octubre";
            break;
            case 11:
            mes = "Noviembre";
            break;
            case 12:
            mes = "Diciembre";
            break;
        default:
        mes = "Mes no válido"; // Valor predeterminado
        System.out.println(mes);
            break;
    }
   
    
    int dias = diasContados(mesConsultado, añoConsultado);
    System.out.println("El mes de "+ mes + " del año "+ añoConsultado +" tuvo " + dias + " dias"); 
    scanner.close();
    scanner2.close();
    }
    public static int diasContados (int mesConsultado, int añoConsultado) {
    YearMonth añoMes = YearMonth.of( añoConsultado,mesConsultado);
    int dias = añoMes.lengthOfMonth();  
    return dias;
    }
}


     