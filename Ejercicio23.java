import java.util.Scanner;
public class Ejercicio23{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que calcule el precio final de un producto según su base imponible");
        System.out.print("Introduzca la base imponible: ");
        double bI = sc.nextDouble();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tIva = sc.next();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codProm = sc.next();

        int tIvaN = 0;
        switch (tIva) {
            case "general":
                tIvaN = 21;
                break;
            case "reducido":
                tIvaN = 10;
                break;
            case "superreducido":
                tIvaN = 4;
                break;
            
            default:
            System.out.println("Introduce bien el tipo de IVA");
                break;
        }
        double iva = (bI*tIvaN)/100;
        double pSinDes = bI + iva;
        double des = 0;

        switch (codProm) {
            case "nopro":
                break;
            case "mitad":
            des = pSinDes/2;
            break;
            case "meno5":
            des = 5;
            break;
            case "5porc":
            des = pSinDes*0.05;
            break;
            default:
            System.out.println("Introduce bien el codigo promocional");
                break;
        }
        double t = pSinDes - des;
        System.out.printf("Base Imponible      %4.5f\n",bI);
        System.out.printf("IVA (%2d%%)           %4.5f\n", tIvaN, iva);
        System.out.printf("Precio con IVA      %4.5f\n", pSinDes);
        System.out.printf("Cód. promo. (%5s) -%4.5f\n", codProm, des);
        System.out.printf("TOTAL               %4.5f", t);

    }
}