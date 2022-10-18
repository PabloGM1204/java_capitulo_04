import java.util.Scanner;
public class Ejercicio11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula los segundos que quedan hasta la hora de media noche");
        System.out.print("Dime una hora: ");
        int horas = sc.nextInt();
        System.out.print("Dime unos minutos: ");
        int mins = sc.nextInt();
        if (horas<12){
            System.out.println("");
            System.out.println("Quedan "+(horas*60)*60+" s");
        }
        
    }
}