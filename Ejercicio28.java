import java.util.Scanner;
public class Ejercicio28{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace el piedra papel o tijera");
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String j1 = sc.next();
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String j2 = sc.next();
        boolean win = true;
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                if (j2.equals("tijera")) {
                    g = 1;
                }
                break;
                case "papel":
                    if (j2.equals("piedra")) {
                    g = 1;
                }
                break;
                case "tijera":
                    if (j2.equals("papel")) {
                    g = 1;
                }
                break;
                default:
                System.out.println("Escriba bien su jugada");
                win = false;
                break;
            }
        if(win){
            System.out.println("Gana el jugador " + g);
        }
        }
    }
}