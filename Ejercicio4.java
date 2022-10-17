import java.util.Scanner;
public class Ejercicio4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra la el salario calculado con la horas realizadas ese semana");
        System.out.print("Dime la cantidad de horas trabajadas esta semana: ");
        int horas = sc.nextInt();
        if (horas<=40){
            System.out.println("El sueldo seria de: "+(horas*12)+" euros");
        }else if(horas>40){
            System.out.println("El sueldo seria de: "+(((40*12)+(horas-40)*16))+" euros");
        }else{
            System.out.println("Digame las horas correctas");
        }
        sc.close();
    }
} 
