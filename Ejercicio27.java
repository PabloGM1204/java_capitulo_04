import java.util.Scanner;
public class Ejercicio27{
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula el presupuesto de una tarta");
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String s = sc.nextLine();
        double pS = 0;
        double pNata = 0;
        double pNom = 0;
        String tChoc = "";
        switch (s) {
            case "manzana":
                pS = 18;
                break;
            case "fresa":
                pS = 16;
                break;
            case "chocolate":
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                tChoc = sc.next();
                if (tChoc.equals("negro")) {
                    pS = 14;
                } else if (tChoc.equals("blanco")) {
                    pS = 15;
                }
                break;
            default:
        }
        System.out.print("¿Quiere nata? (si o no): ");
        boolean conNata = sc.next().equals("si");
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        boolean conNom = sc.next().equals("si");
        System.out.print("Tarta de " + s);
        if (s.equals("chocolate")) {
            System.out.print(" " + tChoc);
        }
        System.out.println(": "+pS);
        if (conNata) {
            pNata = 2.5;
            System.out.println("Con nata: "+pNata);
        }
        if (conNom) {
            pNom = 2.75;
            System.out.println("Con nombre: "+pNom);
        }
        System.out.println("Total: "+(pS + pNata + pNom));
    }
}