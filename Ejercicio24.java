import java.util.Scanner;
public class Ejercicio24{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que genere la nómina");
        System.out.println("1 - Programador junior, 2 - Prog. senior, 3 - Jefe de proyecto");
        System.out.print("Que cargo tienes:");
        int p = sc.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int dia = sc.nextInt();
        System.out.print("Introduzca su estado civil 1 - Soltero, 2 - Casado: ");
        int est = sc.nextInt();
        double sueldoBa = 0;
        switch (p) {
            case 1:
                sueldoBa = 950;
                break;
            case 2:
                sueldoBa = 1200;
                break;
            case 3:
                sueldoBa = 1600;
                break;
            default:
                System.out.println("Introduzca bien el cargo");
                break;
        }
        double sueldoD = dia*30;
        double sueldoBr = sueldoBa + sueldoD;
        double irpf = 0;
        if(est == 1){
            irpf = 25;
        }else if(est == 2){
            irpf = 20;
        } else {
            System.out.println("Introduzaca bien el estado civil");
        }
        double cuantiIrpf = (sueldoBr*irpf)/100;
        System.out.printf("Sueldo base            %7.2f\n", sueldoBa);
        System.out.printf("Dietas (%2d viajes)     %7.2f\n", dia, sueldoD);
        System.out.printf("Sueldo bruto           %7.2f\n", sueldoBr);
        System.out.printf("Retención IRPF (%.0f%%)   %7.2f\n", irpf, cuantiIrpf);
        System.out.printf("Sueldo neto            %7.2f\n", sueldoBr - cuantiIrpf);
    }
}