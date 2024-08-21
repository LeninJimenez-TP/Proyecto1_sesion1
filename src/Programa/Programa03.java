package Programa;
//paquete de datos e/s datos por consola
import java.util.Scanner;
public class Programa03 {
    //metodo principal
    public static void main(String arg[]){
        //declaracion de variables
        String empleado;
        double ingreso,gasto,ahorrom,ahorrob,ahorros,ahorroa;
        //creando el objeto de lectura
        Scanner lectura= new Scanner (System.in);
        //entrada de datos
        System.out.print("Nombre del Cliente: ");
        empleado=lectura.next();
        System.out.print("ingresos del empleado:");
        ingreso=lectura.nextDouble();
        System.out.print("gastos del empleado:");
        gasto=lectura.nextDouble();
        //proceso de datos
        ahorrom=ingreso-gasto;
        ahorrob=ahorrom*2;
        ahorros=ahorrom*6;
        ahorroa=ahorrom*12;
        //salida de datos
        System.out.println("Ahorro Mensual:" +ahorrom);
        System.out.println("Ahorro Bimestral:" +ahorrob);
        System.out.println("Ahorro Semestral:" +ahorros);
        System.out.println("Ahorro Anual:" +ahorroa);   
    }//Fin de metodo
}//Fin de programa
