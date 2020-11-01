/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes.poo;

/**
 *
 * @author sorwarhussian
 */
public class Alumne extends Persona {

    private char nivell = '?';

    /**
     * VALORS VALIDS. B= batxillerat M = Cfgm S = Cfgs ? = desconegud
     */

    public Alumne() {
    }

    public Alumne(String sDni, String sNom, int nEdat, char cNivell) {

        super(sDni, sNom, nEdat);
        nivell = validarNivell(cNivell);
    }
//    public Alumne (Persona p){
//        
//        this (p,'?');
//    }

    public Alumne(String sDni, String sNom, int nEdat) {
        this(sDni, sNom, nEdat, '?');
    }
    
    public Alumne (Alumne a){
        this (a.dni, a.nom, a.edat, a.nivell);
    }
    
    public void setNivell (char nouNivell) {
        
        nivell= validarNivell (nouNivell);
    }
    
    private char validarNivell (char nivell){
        nivell= Character.toUpperCase(nivell);
        if (nivell!='B' && nivell!='S' && nivell!='M') nivell='?';
        return nivell;
    }
    
    public char getNivell (){return nivell;}
    
    public void visualitzar (){
        super.visualitzarPersona();
        System.out.println("Nivell  :"+nivell);
        
    }

   public String toString (){
   
       String s="Dni: "+dni+" - Nom:"+nom+" - Edat:" +edat+" - Nivell:" ;
       switch (nivell){
       
           case 'B': s=s+" Batxillerat";break;
           case'M': s=s+" CFGM ";break;
            case'S': s=s+" CFGS ";break;
            default : s=s+" ??? "; break; 
           
       }
       return s;
   }
   
   //clase main per probar el objectes. 
    public static void main(String[] args) {
        Alumne t[]= new Alumne [6];
        Persona p= new Persona ("000000000", "Juan" , 43);
        t[0] = new Alumne ();
        t[1]= new Alumne ("000000000","Juan ", 43,'b');
        t[2]= new Alumne ("000000000", "Juan",43);
        t[3]= new Alumne (Persona p,'s');
        
        
    }
    
}


