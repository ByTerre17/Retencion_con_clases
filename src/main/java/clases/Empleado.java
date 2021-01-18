/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author manue
 */
public class Empleado {
    private String nombre;
    private double sueldo_bruto;
    private double sueldo_neto;

    public Empleado() {
    }
    
    public void retencion(String salario){
        this.sueldo_bruto = Double.parseDouble(salario);
        
        if(this.sueldo_bruto>3000){
            this.sueldo_neto= this.sueldo_bruto;
            this.sueldo_bruto = this.sueldo_bruto*0.30;
            this.sueldo_neto=this.sueldo_neto-this.sueldo_bruto;
        }
        if(this.sueldo_bruto>1000 && this.sueldo_bruto<3000){
            this.sueldo_neto= this.sueldo_bruto;
            this.sueldo_bruto = this.sueldo_bruto*0.15;
            this.sueldo_neto=this.sueldo_neto-this.sueldo_bruto;
        }
        else{
            this.sueldo_neto= this.sueldo_bruto;
            this.sueldo_bruto = this.sueldo_bruto*0.10;
            this.sueldo_neto=this.sueldo_neto-this.sueldo_bruto;
        }
          
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public double getSueldo_neto() {
        return sueldo_neto;
    }

    public void setSueldo_neto(double sueldo_neto) {
        this.sueldo_neto = sueldo_neto;
    }
    
    
}
