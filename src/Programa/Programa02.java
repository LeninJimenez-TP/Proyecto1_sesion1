
package Programa;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre;
        String producto;
        double precio;
        int cantidad;
        double subtotal;
        double igv;
        double total;

        System.out.print("Nombre del Cliente: ");
        nombre = dato.nextLine();

        System.out.print("Nombre Producto: ");
        producto = dato.nextLine();

        System.out.print("Precio Producto: ");
        precio = dato.nextDouble();

        System.out.print("Cantidad: ");
        cantidad = dato.nextInt();

        subtotal = cantidad * precio;
        System.out.println("SubTotal: " + subtotal);

        igv = subtotal * 0.18;
        System.out.println("IGV: " + igv);

        total = subtotal - igv;
        System.out.println("Total: " + total);
    }
}

