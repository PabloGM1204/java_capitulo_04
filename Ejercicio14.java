import java.util.Scanner;
public class Ejercicio14{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dice si es un numero es par y si es divisible entre 5");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Su número es par");
        }else{
            System.out.println("Su número es impar");
        }

        if(n%5==0){
            System.out.println("Su número es divisible entre 5");
        }else{
            System.out.println("Su número no es divisible entre 5");
        }
        sc.close();

    }
}