import java.util.Scanner;
public class Ejercicio29{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula el precio de un desayuno");
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String c = sc.nextLine();
        String pitufo = "";
        String r = "";
        double prCom = 0;
        if (c.equalsIgnoreCase("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            pitufo = sc.next();
            if (pitufo.equalsIgnoreCase("aceite")) {
                r = "Pitufo con aceite: 1,20 euros";
                prCom = 1.20;
            } else if (pitufo.equalsIgnoreCase("tortilla")) {
                r = "Pitufo con tortilla: 1,60 euros";
                prCom = 1.60;
            }
        } else if (c.equalsIgnoreCase("palmera")) {
            r = "Palmera: 1,40 euros";
            prCom = 1.40;
        } else if (c.equalsIgnoreCase("donut")) {
            r = "Donut: 1,00 euros";
            prCom = 1.00;
        }
        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = sc.next();
        double prBeb = 0;
        if (bebida.equalsIgnoreCase("zumo")) {
            r += "\nZumo: 1,50 euros";
            prBeb = 1.50;
        } else if (bebida.equals("café")) {
            r += "Café: 1,20 euros";
            prBeb = 1.20;
        }
        System.out.println(r);
        System.out.println("Total desayuno: "+(prCom + prBeb));
    }
}