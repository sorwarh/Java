/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class MenuPisos {

    public static void main(String[] args) {

        int opcion;
        int MAX_PISOS = 100, indice = 0;
        Piso[] array = new Piso[MAX_PISOS];

        do {
            
            
            /* Menu para que el usuario elegia una opcion que quiere realizar*/
            opcion = menu();
            

            if (opcion == 1) {
                array[indice] = altaManual();
                indice++;
            } else if (opcion == 2) {

                array = altaAutomatico();

            } else if (opcion == 3) {

                mostrarPisos(array, indice);

            } else if (opcion == 4) {

                serializarPisos(array);
            } else if (opcion == 5) {
                array = deserializar();
                indice = buscarIndice(array);
                System.out.println("indice:" + indice);
            }

        } while (opcion != 6);

    }

    private static int menu() {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("**********Selecciona una opcion**********");
        System.out.println("1.Alta piso (manual)"
                    + "\n2.Alta piso(automatico -- 10 pisos--)"
                    + "\n3.Listado de pisos"
                    + "\n4.Serializar pisos"
                    + "\n5.Deserializar pisos"
                    + "\n6.Salir del menu");

        return opcion = entrada.nextInt();

    }

    private static Piso altaManual() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero de referencia [1234] //4 valores numericos");
        int ref = entrada.nextInt();

        System.out.println("Numero de habitacion ");
        int hab = entrada.nextInt();

        System.out.println("Metros que tiene el piso ");
        double m = entrada.nextDouble();

        System.out.println(" alquiler==true   ||   venta==false ");
        boolean av = entrada.nextBoolean();

        System.out.println("Precio ?");
        double precio = entrada.nextDouble();

        System.out.println("Disponible");
        boolean disp = entrada.nextBoolean();
        Piso p = new Piso(ref, hab, m, av, precio, disp);

        return p;
    }

    private static void mostrarPisos(Piso[] array, int indice) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\t1.Todos los pisos"
                    + "\n\t2.Pisos disponible"
                    + "\n\t3.Pisos en venta"
                    + "\n\t4.Pisos en alquier");

        int opcion = entrada.nextInt();

        System.out.println("\n-------------------------------------------------------------------------");

        switch (opcion) {
            case 1:
                System.out.println("Todos los pisos");
                for (int i = 0; i < indice; i++) {

                    System.out.println(array[i]);

                }
                break;
            case 2:
                System.out.println("Pisos disponibles");
                for (int i = 0; i < indice; i++) {

                    if (array[i].isDisponible()) {
                        System.out.println(array[i]);
                    }

                }
                break;
            case 3:
                System.out.println("Pisos en venta");
                for (int i = 0; i < indice; i++) {

                    if (array[i].isVivienda()) {
                        System.out.println(array[i]);
                    }

                }
                break;
            case 4:
                System.out.println("Pisos en alquiler");
                for (int i = 0; i < indice; i++) {

                    if (!array[i].isVivienda()) {
                        System.out.println(array[i]);
                    }

                }
                break;
            default:
                break;
        }
        System.out.println("\n-------------------------------------------------------------------------");

    }

    private static void serializarPisos(Piso[] array) {

        
        try {
        Scanner entrada=new Scanner(System.in);
        
            System.out.print("\nguardar fichero\nnombre:");
            String fichero=entrada.next();

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero));

            out.writeObject(array);
            out.close();
            System.out.println("Serializado correctamente.....");

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private static Piso[] deserializar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del fichero ?");
        String fichero = entrada.next();
        Piso[] array = {};
        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero));
            array = (Piso[]) in.readObject();
            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return array;

    }

    private static int buscarIndice(Piso[] array) {

        int i = 0;

        while (array[i] != null) {
            i++;
        }
        return i;
    }

    private static Piso[] altaAutomatico() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero de pisos que quieres dar de alta ?");
        int nAlta = entrada.nextInt();

        Piso[] array = new Piso[nAlta];

        //int id, int numero, int puerta, double metros, int habitaciones, boolean lloguer, double mensualidad, boolean disponible
        for (int i = 0; i < nAlta; i++) {

            int id = (int) (Math.random() * (899) + 100);
            int num = (int) (Math.random() * (100) + 1);
            int puerta = (int) (Math.random() * (8) + 1);
            int hab = (int) (Math.random() * (6) + 1);
            int m = (int) (Math.random() * (30) + 20) * (hab);
            int a = (int) (Math.random() * 2);
            int b = (int) (Math.random() * 2);
            int precio = (int) (Math.random() * (400) + 250) * (hab);

            //array[i] = new Piso(id, num, puerta, m, hab, lloguer, precio, randomBoolean());
        }
        return array;
    }

}
