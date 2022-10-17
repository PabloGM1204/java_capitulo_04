import java.util.Scanner;
public class Ejercicio3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa escribe el día de la semana dependiendo de que número le digas");
        System.out.print("Dime un número entre 1 y 7 incluidos: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }
    }
    
}