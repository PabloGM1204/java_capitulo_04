import java.util.Scanner;
public class Ejercicio17{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice la ultima cifra de tu número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.println("La ultima cifra de su número: "+(n%10));
    }
}