package estructura.repetitives;

import java.util.Scanner;
/**
 * 1.1Pintar un artirisco por fila, hasta N filas
 *
 * 1.2 Pintar N asterisco en 1 fila
 *
 * @author sorwarhussian
 */
public class Exercici60_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int fila = 4;
        // o fila<=num
        while (fila >= num) {
            System.out.println("*");
            fila++;
        }
    }
}
