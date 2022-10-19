import java.util.Scanner;
public class Ejercicio19{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.");
        System.out.print("Dime un número de hasta 5 cifras: ");
        int n = Math.abs(sc.nextInt());
        int c =0;
        if ( n < 10 ) {
            c = 1;
        }
        
        if (( n >= 10 ) && ( n < 100 )) {
            c = 2;
        }
        
        if (( n >= 100 ) && ( n < 1000 )) {
            c = 3;
        }
        
        if (( n >= 1000 ) && ( n < 10000 )) {
            c = 4;
        }
        
        if ( n >= 10000 ) {
            c = 5;
        }
        
        if (c == 1) {
            System.out.println("El número introducido tiene 1 dígito.");
        } else {
            System.out.println("El número introducido tiene " +c+" dígitos.");
        }

        
        sc.close();
    }
}