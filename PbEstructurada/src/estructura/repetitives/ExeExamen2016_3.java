package estructura.repetitives;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class ExeExamen2016_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dia, color;

        System.out.println("Quin dia de la setmana es ? \n"
                    + "1.Dilluns \n"
                    + "2.Dimarts \n"
                    + "3.Dimercres \n"
                    + "4.Dijous \n"
                    + "5.Divendres \n"
                    + "6.Dissabte \n");
        dia = in.nextInt();

        System.out.println("Color de cabell ? \n"
                    + "1. Rosses \n"
                    + "2.Morenes \n"
                    + "3.Pellroges \n");
        color = in.nextInt();

        if (color == 1 && (dia == 2 || dia == 3))
        {
            System.out.println("Has de pagar 15€");
        }
        else if(color==2 &&(dia==1 || dia==3)){
            System.out.println("Has de pagar 15€");
        }
        else if(color==3 && (dia==5 || dia==6))
        {
            System.out.println("Has de pagar 15€");
        }
        else {
                     System.out.println("Has de pagar 25€");
                     
                     }

    }

}
