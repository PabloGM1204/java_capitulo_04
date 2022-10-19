import java.util.Scanner;
public class Ejercicio13{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Este programa ordena tres números introducidos");
        System.out.println("Escribe los tres números para ordenarlos");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1>n2){
            a = n1;
            n1 = n2;
            n2 = a;
        }

        if(n2>n3){
            a = n2;
            n2 = n3;
            n3 = a;
        }

        if(n1>n2){
            a = n1;
            n1 = n2;
            n2 = a;
        }

        System.out.println("Los numeros ordenador de menor a mayor son: "+n1+" "+n2+" "+n3);

        sc.close();

    }
}