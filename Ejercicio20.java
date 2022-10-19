import java.util.Scanner;
public class Ejercicio20{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Este programa que diga si un número entero positivo introducido por teclado es capicúa.");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        boolean capicuo = true;
        if(n<10){
            System.out.println("El número solo tiene una cifra por lo que se da por hecho que es capicúo");
        }
        if(n>=10 && n<100){
            if((n/10)==(n%10)){
                System.out.println("Este número es capicúo");
            }
        }else{
            capicuo=false;
        }
        if(n>=100 && n<1000){
            if((n/100)==(n%10)){
                System.out.println("Este número es capicúo");
            }
        }else{
            capicuo=false;
        }
        if(n>=1000 && n<10000){
            if(((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))){
                System.out.println("Este número es capicúo");
            }
        }else{
            capicuo=false;
        }
        if (n >= 10000) {
            if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
            System.out.println("Este número es capicúo");
            }
        }else{
            capicuo=false;
        }
        if(capicuo == false){
            System.out.println("No es capicuo");
        }
    }
}