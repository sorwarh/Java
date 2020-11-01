/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.repetitives;

/**
 *
 * @author sorwarhussian
 */
public class Algorismo6 {

    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = 1; space <= MAX_ROWS - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int trunc = 3; trunc > 0; trunc--) {
            for (int space = 1; space <= MAX_ROWS - 1; space++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
