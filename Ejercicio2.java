import java.util.Scanner;
public class Ejercicio2{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice saluda de una forma u otra dependiendo de la hora que le digas");
        System.out.print("Dime una hora(0-24): ");
        int hora = sc.nextInt();
        if (hora>=6 && hora<=12){
            System.out.println("Buenos días");
        }
        if(hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        }
        if(((hora>=21) && (hora<=24)) || ((hora<=5) && (hora>=0))){
            System.out.println("Buenas noches");
        }
        if(hora>= 24 || hora<0){
            System.out.println("Escriba bien la hora");
        }

    }
}