import java.util.Scanner;
public class Ejercicio1{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice la primera asignatura que tienes");
        System.out.print("Dime un día de la semana ");
        String dia = sc.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("Programación");
                break;
            case "Martes":
                System.out.println("Sistemas Informáticos");
                break;
            case "Miercoles":
                System.out.println("Entorno de desarrollo");
                break;
            case "Jueves":
                System.out.println("Programación");
                break;
            case "Viernes":
                System.out.println("Programación");
                break;
            
            default:
                System.out.println("Dime un dia entre el lunes y el viernes incluidos");
                break;
        }
        sc.close();

    }
}