/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zcle_02;

/**
 *
 * @author Luis
 */
public class Recibo {
//valores "atributos Recibo"
public String noCuenta,nombre,direccion,fecha;
public double consumo,cantidadPago;
//Metodos recibo
public  double calcularPago(double costom3){
this.cantidadPago=costom3*consumo;
return this.cantidadPago;
};
}
