/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.io.Serializable;

/**
 *
 * @author sorwarhussian
 */
public class Piso implements Serializable {
    
    private  int referencia;
    private int habitaciones ; 
    private double metros;
    private boolean vivienda;
    private double precio;
    private boolean disponible;

    @Override
    public String toString() {
        
        String tipo="VENTA";
        if (!vivienda) tipo="ALQUILER";
        
        String disp="SI";
        if(!disponible) disp="NO";
        return "referencia=" + referencia + ", habitaciones=" + habitaciones + ", metros=" + metros + ", " + tipo + ", precio=" + precio + ", disponible=" + disp + '}';
    }
    

    public Piso(int referencia, int habitaciones, double metros, boolean vivienda, double precio, boolean disponible) {
        this.referencia = referencia;
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.vivienda = vivienda;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    

    public int getReferencia() {
        return referencia;
    }

  

    public int getHabitaciones() {
        return habitaciones;
    }



    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public boolean isVivienda() {
        return vivienda;
    }

    public void setVivienda(boolean vivienda) {
        this.vivienda = vivienda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
