package apuntes.pkgwhile;

import java.util.Scanner;

/**
 * programa que automaticamente genera un numero 0-100 y el usuario debe acertar
 * con el menor intentos possibles
 *
 * @author sorwarhussian
 */
public class AcertarNumeros0a100 {

    public static void main(String[] args) {

        int numrandom = (int) (Math.random() * 100);

        Scanner in = new Scanner(System.in);

        int numero = 0, intento = 0;
        while (numero != numrandom) {

            System.out.println("Numero?");
            numero = in.nextInt();

            if (numero != numrandom) {
                System.out.println("Numero Inconrrecto ");
                
                intento=numero++;
            }
            if (intento == 3) {
                System.out.println("Se ha acabo tus intentos");
                System.out.println("El numero es " + numrandom);

            }

        }
        System.out.println("Numero Correcto ");
        System.out.println("Eres un genio");

    }

}
