/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sorwarhussian
 */
public class Producte {

    private int identificador;
    private String descripcio;
    private double preu;
    private String color;
    private char talla;

    public Producte(int identificador, String descripcio, double preu, String color, char talla) {
        this.identificador = identificador;
        this.descripcio = descripcio;
        this.preu = preu;
        this.color = color;
        this.talla = talla;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public char getTalla() {
        return talla;
    }

    
    public String toString() {
        return "id=" + identificador + ", desc=" + descripcio + ", preu=" + preu + ", color=" + color + ", talla=" + talla;
    }

}
