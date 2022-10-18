import java.util.Scanner;
public class Ejercicio7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace la media de tres notas");
        System.out.print("Dime la primera nota que has sacado: ");
        double n1 = sc.nextDouble();
        System.out.print("Dime la segunda nota que has sacado: ");
        double n2 = sc.nextDouble();
        System.out.print("Dime la tercera nota que has sacado: ");
        double n3 = sc.nextDouble();
        System.out.printf("La nota media es de: %.2f ",(n1+n2+n3)/3);

        sc.close();
    }
}