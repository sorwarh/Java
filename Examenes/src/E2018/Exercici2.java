package E2018;

/**
 *
 * @author sorwarhussian
 */
public class Exercici2 {

    public static void main(String[] args) {
        int[][] array = new int[6][6];
        String numero = " ";
        int n = 90 - 10 + 1;
        
        for (int i = 0; i < array.length; i++) {
        
            for (int j = 0; j < array[i].length; j++) {
            
                array[i][j] = (int) (Math.random() * n);
                
                System.out.print(array[i][j] + " ");
                
                if (!(array[i][j] < 10 || array[i][j] > 50)) {
                    numero += array[i][j] + " ";
                }
            }
            System.out.println(" ");
        }
        System.out.println(numero);

    }

}
