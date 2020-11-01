/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class BombetaMain {

    public static void main(String[] args) {

        Bombeta[] bombetes = new Bombeta[6];

        Scanner entrada = new Scanner(System.in);

        //<editor-fold defaultstate="collapsed" desc="PROVES">
        //comprovar bombeta
//        System.out.println("Comprobar bombeta ");
//        Bombeta b1 = new Bombeta(3);
//        System.out.println("Intesitat =3 ");
//        b1.comprovarBombeta(b1.getIntensitat());
//        System.out.println("Intesitat =0 ");
//        b1.setIntensitat(0);
//        b1.comprovarBombeta(b1.getIntensitat());
//        System.out.println("Intesitat =5 ");
//        b1.setIntensitat(5);
//        b1.comprovarBombeta(b1.getIntensitat());
//</editor-fold>

        //Estat incial 
//        System.out.println("\nEstat Inicial ");
//        mostrarBombetes(bombetes);

        //Asignar un valor random a la intensidad
        for (int i = 0; i < bombetes.length; i++) {

            bombetes[i] = new Bombeta((int) (Math.random() * 6));

        }

        System.out.println("\n Valor random de intensidad");
        mostrarBombetes(bombetes);

//<editor-fold defaultstate="collapsed" desc="APAGAR BOMBETA">
//Apagar la intesitat de les bombetes
/*  System.out.println("Vols apagar l'intesitat de les bombetes ?[ true / false ]");
boolean apagar = entrada.nextBoolean();

if (apagar) {
System.out.println("Apagant l'intensitat (intesitat =0 )");

for (int i = 0; i < bombetes.length; i++) {

bombetes[i].setIntensitat(0);

}

System.out.println("Bombetes apagat ");

mostrarBombetes(bombetes);
} else {
System.out.println("opss: no has modificat l'intensitat");
}*/
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="BAIXAR INTENSITAT BOMBETES ">
/*bombetes = baixarIntesitatBombetes(bombetes);

mostrarBombetes(bombetes);*/
//</editor-fold>


//Total bombetes creades
            
            System.out.println("\n\nTotal bombetes creades "+Bombeta.contadorBombetes);


    }

    private static void mostrarBombetes(Bombeta[] bombetes) {

        for (Bombeta bombete : bombetes) {

            System.out.println(bombete);

        }
    }

    private static Bombeta[] baixarIntesitatBombetes(Bombeta[] bombetes) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < bombetes.length; i++) {

            System.out.println("Insertar nova intensitat de la bombeta " + i);
            bombetes[i].setIntensitat(entrada.nextInt());
        }
        System.out.println("Intesitat modificat");
        return bombetes;
    }

}
