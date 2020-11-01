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
public class Ascensor {

    private String marca;
    private int maxCapacidad;

    public Ascensor(String marca, int maxCapacidad) {
        this.marca = marca;
        this.maxCapacidad = maxCapacidad;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "marca=" + marca + ", maxCapacidad=" + maxCapacidad + '}';
    }

    public void funcionament(int numPersones) {
        int posAscensor = (int) (Math.random() * 20) -5;
        System.out.println("Planta actual " + posAscensor);
        
        int plantaDesti= plantaDesti();
        
        if (numPersones < maxCapacidad) {

            System.out.println("Ascensor en marcha");
            
            while (plantaDesti!=posAscensor){
                
                if (plantaDesti<posAscensor){
                posAscensor--;
                }
                else {
                    posAscensor++;
                   
                }
                System.out.println("Planta actual "+posAscensor);
            }

        } else {
            System.out.println("Sobrecargaa");
        }
    }

    private static int plantaDesti() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Planta Desti ? ");
        int n = entrada.nextInt();
        return n;
    }

}
