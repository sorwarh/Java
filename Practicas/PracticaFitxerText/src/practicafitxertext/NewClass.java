/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafitxertext;

/**
 *
 * @author sorwarhussian
 */
public class NewClass {

    public static void main(String[] args) {

       String l="   -Títol de la notícia";
        System.out.println(l);
        String tab = tabulador(l);

        System.out.println(tab + "tab");
        
        int a=posInici(l);
        System.out.println(a);
        
        String s=l.substring(0, a)+"";
        
        

    }

    public static String tabulador(String l) {
        String tab = "";
        boolean salir = false;
        for (int i = 0; i < l.charAt(i) && !salir; i++) {

            if (l.charAt(i) == ' ') {
                tab += " ";

            } else {
                salir = true;
            }

        }

        return tab;
    }
    
     public static int posInici(String s) {
        s = s.toUpperCase();
        int i = 0;
        while (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && i < s.length()) {
            i++;
        }
        return i;

    }

}
