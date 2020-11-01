package scrabble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exemple d'ús d'una funció per llegir paraules d'un diccionari que és un
 * fitxer de text, amb paraules per línia. Es guarden en un array d'Strings.
 *
 * @author montse
 * @version març de 2016
 */
public class ProvesFitxers {

    /**
     * Llegeix un fitxer de text amb paraules i les carrega dins un array
     * d'strings.
     *
     * @param path el nom del fitxer de paraules
     * @return un array d'strings amb les paraules del fitxer
     * @throws FileNotFoundException una excepció si no troba el fitxer
     */
    public static String[] llegirParaules(String path) throws FileNotFoundException {

        Scanner lectura = new Scanner(new File(path));
        //variable auxiliar, dinàmica
        ArrayList<String> llista = new ArrayList();
        //System.out.println("Carregant diccionari de paraules...");
        while (lectura.hasNext()) {
            //assegurem que treballem amb majúscules
            String s = lectura.next().toUpperCase();
            //guardo dins la llista
            llista.add(s);
        }
        //convertir ArrayList a array d'String
        return llista.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String nomFitxer="words.txt";
      
        String[] paraules;
        try {
            paraules = llegirParaules(nomFitxer);
            System.out.println("Paraules llegides correctament...");
            
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        }
        
        
        
        
    }
}
