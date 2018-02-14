/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zcle_02;
import java.util.Scanner;
/**
 * Universidad De La Salle Bajio
 * Ingenieria en Sistemas y Software Computacionales
 * Alumno:Luis Edgar Zanella Contreras
 * Matricula:65402
 * Descripción:La Conagua requiere determinar el pago que debe realizar 
 * una persona por el total de metros cúbicos, que consume de agua.
 * @author Luis
 */
public class ZCLE_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recibo r1= new Recibo();
//leer los datos de la cuenta
r1.noCuenta=leerString("por favor el numero de cuenta: ");
r1.nombre=leerString(" el nombre del cliente: ");
r1.direccion=leerString("la direccion del cliente: ");
r1.fecha=leerString("la fecha");
r1.consumo= leerdouble("Costo de m3: ");
//obtiene
System.out.println("Total a pagar: "+ r1.calcularPago(9));
//imprime el recibo
imprimirRecibo(r1);
    }
    //statica ya que no requiere indicarle
    //a la propia clase que se esta usando simplemente porque es la
    //que se usa mutuamente no la usa alguien más
    public static String leerString(String cadena){
String aux;
Scanner read= new Scanner(System.in);
System.out.println("Introduce"+cadena);
aux=read.nextLine();
return aux;
}
    //Recibe string devuelve double
    public static double leerdouble(String cadena){
double aux;
Scanner read= new Scanner(System.in);
System.out.println("Introduce"+cadena);
aux=read.nextDouble();
return aux;
}
    //imprime la clase
    public static void imprimirRecibo(Recibo obj){
System.out.println("NoCuenta:"+obj.noCuenta);
System.out.println("Cliente:"+obj.nombre);
System.out.println("Direccion:"+obj.direccion);
System.out.println("Fecha:"+obj.fecha);
System.out.println("Consumo:"+obj.consumo);
System.out.println("Cantidad a pagar:"+obj.cantidadPago);
}
}
