import java.util.Scanner;
public class Ejercicio26{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace la factura de un cine");
        System.out.print("Número de entradas: ");
        int ent = sc.nextInt();
        System.out.print("Día de la semana:");
        String dia = sc.next();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        boolean tarj = (sc.next()).equals("s");
        int entInd = ent;
        double preInd = 8;
        int entPar = 0;
        double t = 0;
        double des = 0;
        double p = 0;
        switch (dia) {
            case "miercoles":
                preInd = 5;
                break;
            case "jueves":
                entPar = ent / 2;
                entInd = ent % 2;
            default:
                break;
        }
        t = preInd*entInd;
        t += 11*entPar;
        if(tarj){
            des = t*0.1;
        }
        p = t - des;
        if(entPar>0){
            System.out.println("Entradas de pareja: "+entPar);
            System.out.println("Precio de entrada por pareja: 11.0");
        }
        if(entInd>0){
            System.out.println("Entradas individuales: "+entInd);
            System.out.println("Precio de entrada individual: "+preInd);
        }
        System.out.println("Total:     "+t);
        System.out.println("Descuento: "+des);
        System.out.println("A pagar:   "+p);
    }
}