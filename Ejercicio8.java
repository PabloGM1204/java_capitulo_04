import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace la media de tres notas");
        System.out.print("Dime la primera nota que has sacado: ");
        double n1 = sc.nextDouble();
        System.out.print("Dime la segunda nota que has sacado: ");
        double n2 = sc.nextDouble();
        System.out.print("Dime la tercera nota que has sacado: ");
        double n3 = sc.nextDouble();
        double m = (n1+n2+n3)/3;
        System.out.printf("La nota media es de: %.2f ",m);
        if(m>=0 && m<5){
            System.out.println("Insuficiente");
        }else if(m==5){
            System.out.println("Suficiente");
        }else if(m>5 && m<=6){
            System.out.println("Bien");
        }else if(m>6 && m<=8){
            System.out.println("Notable");
        }else if(m>=9 && m<=10){
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Escriba correctamente las notas");
        }
        sc.close();
    }
}