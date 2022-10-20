import java.util.Scanner;
public class Ejercicio25{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace tickets de una tienda");
        System.out.print("Altura de la bandera en cm: ");
        int alt = Integer.parseInt(sc.nextLine());
        System.out.print("Anchura de la bandera en cm: ");
        int anc = Integer.parseInt(sc.nextLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        boolean conEsc = ((sc.nextLine()).toLowerCase()).equals("s");
        String esCad = "";
        float prEsc = 0;
        if(conEsc){
            esCad = "Con escudo";
            prEsc = 2.5f;
        } else {
            esCad = "Sin escudo";
            prEsc = 0;
        }
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %2d cm2: %4.2f euros\n", anc*alt, (float)anc*alt/100);
        System.out.printf("%s:           %4.2f euros\n", esCad, prEsc);
        System.out.printf("Gastos de envío:      %4.2f euros\n", 3.25);
        System.out.printf("Total:                %4.2f euros\n", (float)anc * alt/100 +prEsc+3.25);
    }
}