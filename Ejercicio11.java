import java.util.Scanner;
public class Ejercicio11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula los segundos que quedan hasta la hora de media noche");
        System.out.print("Dime una hora: ");
        int horas = sc.nextInt();
        int horast = 0;
        System.out.print("Dime unos minutos: ");
        int mins = sc.nextInt();
        int minst = 0;
        if (horas<=24 && horas>=0){
            // System.out.println("Quedan "+(24-horas)+" horas");
            horast = (horas*3600);
        }else{
            System.out.println("Escriba bien las hora");
        }
        if (mins<=60){
            // System.out.println("Quedan "+(60-mins)+" minutos");
            minst = (mins*60);
        }else{
            System.out.print("Escriba bien los minutos");
        }
        
        System.out.println("Son las quedan "+((24*3600)-(horast + minst))+" s");
        sc.close();

    }
}