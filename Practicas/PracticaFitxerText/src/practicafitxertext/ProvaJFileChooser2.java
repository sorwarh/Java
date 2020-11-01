package practicafitxertext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/** Exemple molt senzill per utilitzar una classe gràfica per seleccionar
 *  fitxers del sistema de fitxers del s.o.
 *  showOpenDialog es per seleccionar obrir un fitxer
 *  showSaveDialog es per seleccionar gravar a un fitxer
 *
 * @author Montse
 * @version maig 2012
 */
 public class ProvaJFileChooser2 {

    public static void main(String[] args) {

        /* Aquestes linies son per canviar el Look And Feel , 
         * l'aparença del s.o.
         * Java pot escollir entre aquests tipus diferents 
        String metal="javax.swing.plaf.metal.MetalLookAndFeel";
        String motif="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        String nimbus="com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
        String windows="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        String winClassic="com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
         */
        /* Aqui agafem l'aparença per defecte, la que estigui instal·lada*/
        String nativeLF = UIManager.getSystemLookAndFeelClassName();
        try {
      
            UIManager.setLookAndFeel(nativeLF);
        } catch (Exception e) {
        }

        JFileChooser selector = new JFileChooser();
       
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int ok = selector.showOpenDialog(null);
        /* showOpenDialog pot retornar tres valors
         * JFileChooser.CANCEL_OPTION
         * JFileChooser.APPROVE_OPTION
         * JFileCHooser.ERROR_OPTION 
         */
        if (ok != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "Adéu. Fins una altra vegada");
        } else {
            File fitxerEntrada = selector.getSelectedFile();
            String paraula = null;
            

            JFileChooser selector2 = new JFileChooser();
            int ok2 = selector2.showSaveDialog(null);
            if (ok2 != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "Adéu. Fins una altra vegada");
            } else {
                File fitxerSortida = selector2.getSelectedFile();
                try {
                    /* El constructor de FileWriter amb true fa APPEND al fitxer, no "matxaca" */
                    PrintWriter pw = new PrintWriter(new FileWriter(fitxerSortida, true));
                    pw.println(paraula);
                    pw.println("adeu");
                    pw.close();
                } catch (IOException e) {
                    System.out.println("Problemes d'E/S");
                }
            }
        }
    }
}