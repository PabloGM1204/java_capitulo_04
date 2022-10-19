import java.util.Scanner;
public class Ejercicio21{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la nota de un trimestre de la asignatura Programación.");
        System.out.print("Dime la nota de tu primer examen: ");
        double nt1 = sc.nextDouble();
        System.out.print("Dime la nota de tu segundo examen: ");
        double nt2 = sc.nextDouble();
        double t = (nt1+nt2)/2;
        if(t< 5){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String apt = sc.nextLine();
            apt = sc.nextLine();
            if(apt.equals("apto")){
                t = 5;
            }
        }
        System.out.println("tu media es: "+t);
    }
}