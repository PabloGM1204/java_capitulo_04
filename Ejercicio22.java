import java.util.Scanner;
public class Ejercicio22{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.");
        System.out.print("Dime un dia de la semana entre el Lunes y el viernes: ");
        String dia = sc.nextLine();
        int nd = 0;

        switch (dia) {
            case "lunes":
                nd = 0;
                break;
            case "martes":
                nd = 1;
                break;
            case "miércoles":
                nd = 2;
                break;
            case "jueves":
                nd = 3;
                break;
            case "viernes":
                nd = 4;
                break;
            default:
                System.out.println("Escriba correctamente el día");
                break;
        }
        System.out.print("Dime la hora: ");
        int h = sc.nextInt();
        System.out.print("Dime los minutos: ");
        int m = sc.nextInt();
        int mt = (4*(24*60))+(15*60);
        int mact = (nd*(24*60))+(h*60)+m;
        System.out.println("Faltan "+(mt-mact)+" para el proximo finde");

    }
}