package anemalteatresorwar;
import java.util.Scanner;
/**
 * Programa que calcula el preu d’una cistella de la compra d’entrades per un
 * espectacle d’un teatre. A partir de 10 entrades, s’aplicarà sempre la tarifa de grup.
 * Heu de demanar quantes entrades es volen i aplicar les millors tarifes fent les mínimes preguntes possibles.
 * @author Sorwar Tasoul B.
 * @version 1.2 04/11/2018
 */
public class AnemAlTeatreSorwar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declaracio de variables
        int numentrada, edat, optedat, opcion1, op2, op3;
        double p10, p15, p50;
        System.out.println("Preu General= 24€");
        System.out.println("Quantes entrades vols comprar?");
        numentrada = in.nextInt();
        // Tenim tres tipus de descomptes (10%, 15%, 50%)
        p10 = 21.50 * numentrada;
        p15 = 20.00 * numentrada;
        p50 = 12.00 * numentrada;

        //Primer preguntem quantes entrades en vol
        if (numentrada > 10 || numentrada == 10) {
            System.out.println("Descompte 50% per grup.   "
                    + "Has de pagar " + p15 + " €");
            //Si les entrades son menors que 10, preguntem la edat. 
        } else if (numentrada < 10) {
            System.out.println("Quants anys tens?");
            edat = in.nextInt();
            // Quan la edat es menor <35, li surtiran aquestes opcionn i hauria de triar una y de seguida sortiria el preu total. 
            if (edat <= 35) {
                System.out.println("Selecciona una opcio:");
                System.out.println("1. Carnet Jove (Descompte 50%)");
                System.out.println("2. Menors de 35 anys (Descompte 50%)");
                System.out.println("3. Abonat Jove (Descompte 15%)");
                optedat = in.nextInt();
                if (optedat == 1 || optedat == 2) {
                    System.out.println("Has de pagar " + p50 + " €");
                } else {
                    System.out.println("Has de pagar " + p15 + " €");
                }
            }
            //Si la edat es entre 36 i 64, li sortiran les seguents opcions. 
            if (edat > 35 && edat < 65) {
                System.out.println("Selecciona una opcio:");
                System.out.println("1. Aturat (Descompte 50%)");
                System.out.println("2. Opcions de Abonats");
                System.out.println("3. Compra Anticipat (Descompte 15%)");
                System.out.println("4. Familia Nombrosa o Familia d'acollida (Descompte de 15%)");
                System.out.println("5.Altres opcions");
                System.out.println("6. Entrada Genreal (Sense oferta)");
                opcion1 = in.nextInt();
                if (opcion1 == 1) {
                    System.out.println("Has de pagar " + p50 + " €");
                }
                if (opcion1 == 3 || opcion1 == 4) {
                    System.out.println("Has de pagar " + p15 + " €");
                }
                // si es un abonat hauria de seleccionar l'opcio abonat i de seguida es mostrara unes altres opcions
                if (opcion1 == 2) {
                    System.out.println("Selecciona una opcio:");
                    System.out.println("1. Abonat (Descompte 15%)");
                    System.out.println("2. Abonat Auditori (Descompte 15%)");
                    System.out.println("3. Abonat Liceu (Descompte 15%)");
                    System.out.println("4. Abonat Mercat Flors (Descompte 10%)");
                    op2 = in.nextInt();
                    if (op2 == 1 || op2 == 2 || op2 == 3) {
                        System.out.println("Has de pagar " + p15 + " €");
                    }
                    if (op2 == 4) {
                        System.out.println("Has de pagar " + p10 + " €");
                    }
                }
                // si la seva opcio a descompte no hi figura en cap del anteriors, triara la opcio 5 on li sortira uns altres opcions
                if (opcion1 == 5) {
                    System.out.println("Selecciona una opcio:");
                    System.out.println("1. Discapacitat (Descompte 15%) (");
                    System.out.println("2. Carnet Biblioteca (Descompte 10%)");
                    System.out.println("3. Tr3sc (Descompte 10%)");
                    System.out.println("4. Promocio Club Lectura (Descompte 15%)");
                    op3 = in.nextInt();
                    if (op3 == 1 || op3 == 4) {
                        System.out.println("Has de pagar " + p15 + " €");
                    }
                    if (op3 == 2 || op3 == 3) {
                        System.out.println("Has de pagar " + p10 + " €");
                    }
                }
                //quan no te cap descompte pagara el import general
                if (opcion1 == 6) {
                    System.out.println("Has de pagar " + 24 * numentrada + " €");
                }
            }
            //si la edat es igual 65 o mayor, automaticament se li aplicara el descompte 15%. 
            if (edat >= 65) {
                System.out.println("Has de pagar " + p15 + " €");
            }
        }
    }
}
