
package Programa;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        int n=0;
        int total=0;
        double prom=0;
        for(int i=0; i<5;i++){
            System.out.print("Sueldo " + (i+1) + ": ");
            n = dato.nextInt();
            total += n;
        }
        System.out.println("El total de Sueldos es: " + total);
        System.out.println("EL promedio de sueldos es: " + (total/5));
    }
}
