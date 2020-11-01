
package bucles.FOR;
/**
 *
 * @author sorwarhussian
 */
public class CuadradodeNumeros {

    public static void main(String[] args) {

        int n=5; // tamaño del lado
        int fila, col;
        
        
        for (fila = 1; fila <= n; fila++) {
            
            for (col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // fuera de segundo for
            System.out.println("");
        }

    }

}
