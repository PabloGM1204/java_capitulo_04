import java.util.Scanner;
public class Ejercicio9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado, ax^2+bx+c");
        System.out.print("Dime el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Dime el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Dime el valor de c: ");
        double c = sc.nextDouble();
        if ((a == 0) && (b == 0) && (c == 0)){
            System.out.println("La ecuación tiene infinitas soluciones");
        }
        if((a == 0) && (b == 0) && (c !=0)){
            System.out.println("La ecuacuón no tiene solución");
        }
        if((a != 0) && (b != 0) && (c == 0)){
            System.out.println("x1 = 0");
            System.out.println("x2 = "+(-b/a));
        }
        if((a == 0) && (b != 0) && (c != 0)){
            System.out.println("x1 =  x2 = "+(-c / b));
        }
        if ((a != 0) && (b != 0) && (c != 0)) {
        
            double rest = b*b - (4 * a * c);
            
        if (rest < 0) {
                System.out.println("No tiene soluciones reales");
            } else {
              System.out.println("x1 = " + (-b + Math.sqrt(rest))/(2 * a));
              System.out.println("x2 = " + (-b - Math.sqrt(rest))/(2 * a));
            }      
        }
        sc.close();

    }
}
