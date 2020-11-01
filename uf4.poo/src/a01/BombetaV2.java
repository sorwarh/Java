package a01;

/**
 *
 * @author sorwarhussian
 */
public class BombetaV2 {

    //constant per tots els objectes de la clase (ahorro de memoria )
    final static public int MAX_INTENSITAT = 5;

    //atributs de la clase
    private int intensitat;
    boolean estaApagada, estaFosa;
    public static int totalBombetes = 0;
    public static int bombetesApagades = 0;
    public static int bombetesFos = 0;
    public static int bombetesEnces = 0 ; 

    //constructor 
    public BombetaV2() {
        intensitat = 0;
        estaApagada = true;
        estaFosa = false;
        totalBombetes ++ ; 
    }

    public void encendre() {
        if (!estaFosa) {
            estaApagada = false;
        }
        bombetesEnces = BombetaV2.totalBombetes- ( BombetaV2.bombetesApagades + BombetaV2.bombetesFos  ) ; 
        
    }

    public void apagar() {
        estaApagada = false;
        intensitat = 0;
        bombetesApagades =BombetaV2.totalBombetes- ( BombetaV2.bombetesEnces + BombetaV2.bombetesFos  )   ; 
    }

    public void incrementarIntensitat(int a) {

        if (!estaApagada && !estaFosa) {
            intensitat=intensitat +a;
           
            if (intensitat > MAX_INTENSITAT) {
                estaFosa = true;
                bombetesFos ++ ; 
            }

        }

    }

    @Override
    public String toString() {
        return "CorrecionBombeta{" + "intensitat=" + intensitat + ", estaApagada=" + estaApagada + ", estaFosa=" + estaFosa + '}';
    }

 

}
