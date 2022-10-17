import java.util.Scanner;
public class Ejercicio6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula cuanto tardara un objeto en caer");
        System.out.print("Dime a la altura que esta el objeto: ");
        double h = sc.nextDouble();
        double g = 9.81;
        if (h>0){
            System.out.printf("El objeto tardara en caer %.2f segundos", (Math.sqrt((2*h)/g)));
        }else{
            System.out.println("Altura incorrecta");
        }
    }
}