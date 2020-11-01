/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2part;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class E40 {

    public static void main(String[] args) {

        //40. Calcular l'àrea d'una figura geomètrica a triar
        //quadrat, cercle, rectangle i cilindre). 
        //Es mostrarà per pantalla un menú amb les diferents opcions de les figures geomètriques disponibles, 
        //l'usuari en triarà una i a continuació el programa demanarà la informació que necessiti per al càlcul
        //i finalment mostrarà per pantalla el valor de l'àrea.
        Scanner entrada = new Scanner(System.in);

        int costat, base, altura, radi, area;
        String opcio;

        System.out.println("Figura?");
        System.out.println("A. Quadrat \n"
                    + "B. Cercle \n"
                    + "C. Rectangle \n"
                    + "D. Cilindre Regular \n"
                    + "Seleciona una letra minuscula");
        opcio = entrada.next();

        switch (opcio) {

            case "a":
                System.out.println("Valor de un Costat?");
                costat = entrada.nextInt();

                area = costat * costat;
                System.out.println("La Area total es de " + area + " m^2\n");

                ;
                break;
            case "b":
                System.out.println("El radi del Cercle?");
                radi = entrada.nextInt();
                area = (int) (Math.PI * Math.pow(radi, 2));
                System.out.println("La Area total es de " + area + " m^2\n");
                ;
                break;
            case "c":
                System.out.println("Base i Altura");
                base = entrada.nextInt();
                altura = entrada.nextInt();

                area = base * altura;
                System.out.println("La Area total es de " + area + " m^2\n");

                ;
                break;
            case "d":
                System.out.println("Radi i Altura del Cilindre Regular");
                radi = entrada.nextInt();
                altura = entrada.nextInt();
                area = (int) ((2 * Math.PI * radi * altura) + (2 * Math.PI * radi * radi));
                System.out.println("La Area total es de " + area + " m^2\n");

            default:
                System.out.println("gracias");
                

        }

    }

}
