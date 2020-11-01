/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes.poo;

import java.util.Objects;

/**
 *
 * @author sorwarhussian
 */
public class Persona {

    final static int MAX_EDAT = 150;
    public String dni, nom;
    public int edat;

    public Persona() {
    }

    public Persona(String dni, String nom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.edat = edat;
    }

    public Persona(Persona p) {
        this(p.dni, p.nom, p.edat);
    }

    public Persona clonar() {
        return new Persona(this);
    }

    //retorna 0 si dni se ha modificado 
    public int setDni(String nouDni) {
        dni = nouDni;
        return 0;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
    }

    //retorna 0 si edat se ha modificado, retorna 1 si edat es negativa i retorna 2 si l'edat passa MAX_EDAT
    public int setEdat(int novaEdat) {

        if (novaEdat < 0) {
            return 1;
        }
        if (novaEdat > MAX_EDAT) {
            return 2;
        }
        edat = novaEdat;
        return 0;
    }

    public void visualitzarPersona() {

        System.out.println("Dni  :" + dni);
        System.out.println("Nom  :" + nom);
        System.out.println("Edat  :" + edat);
    }

    // NI IDEA 
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Persona) {
            return dni.equals(((Persona) obj).dni);
        }
        return false;
    }

    public int hasCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    //
    @Override
    public String toString() {
        return dni + "  -  " + nom;
    }
}
