/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatalumnes;

/**
 *
 * @author sorwarhussian
 */
public class Alumne {

    private int edat;

    public Alumne(int edat) {
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Alumne{" + "edat=" + edat + '}';
    }

    public static void main(String[] args) {

        Alumne a1;
        

    }

}
