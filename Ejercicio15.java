import java.util.Scanner;
public class Ejercicio15{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que pinte una pirámide rellena con un carácter");
        System.out.print("Dime un caracter para hacer la piramide: ");
        String c = sc.nextLine();
        System.out.print("Dime la orientación de la piramide (1-Arriba, 2-Abajo, 3-Derecha, 4-Izquierda): ");
        int o = sc.nextInt();
        if(o==1){
            System.out.println("   "+c);
            System.out.println("  "+c+c+c);
            System.out.println(" "+c+c+c+c+c);
            System.out.println(c+c+c+c+c+c+c);
        }
        if(o==2){
            System.out.println(c+c+c+c+c+c+c);
            System.out.println(" "+c+c+c+c+c);
            System.out.println("  "+c+c+c);
            System.out.println("   "+c);
        }
        if(o==3){
            System.out.println(c);
            System.out.println(c+c);
            System.out.println(c+c+c);
            System.out.println(c+c);
            System.out.println(c);
        }
        if(o==4){
            System.out.println("  "+c);
            System.out.println(" "+c+c);
            System.out.println(c+c+c);
            System.out.println(" "+c+c);
            System.out.println("  "+c);
        }
    }
}