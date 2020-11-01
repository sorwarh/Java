
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sorwarhussian
 */
public class Exercici2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" N ? ");
        int n = entrada.nextInt();

        char[] array = new char[n];

        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
        char[] consonantes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'Y', 'X', 'Z'};

        String palabra = "";
        for (int i = 1; i < array.length + 1; i++) {
            if (i % 2 == 0) {
                int f = (int) (Math.random() * (vocales.length));
                palabra += vocales[f];
            } else {
                int f = (int) (Math.random() * (consonantes.length));
                palabra += consonantes[f];
            }
        }
        System.out.println(palabra);

    }

}
