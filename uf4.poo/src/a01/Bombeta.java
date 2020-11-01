package a01;

/**
 *
 * @author sorwarhussian
 */
public class Bombeta {

    private int intensitat;
    
    public static int contadorBombetes = 0 ;
    
   
    
    

    public Bombeta(int intensitat) {
        this.intensitat = intensitat;
        contadorBombetes++;
        

    }

    @Override
    public String toString() {
        
        String msg="";
        if (intensitat >= 5) {

            msg="Bombeta cremat";
        } else if (intensitat == 0) {
            msg="Bombeta apagat";
        } else {
            msg="Bombeta ences";
        }

        return "Bombeta{" + "intensitat=" + intensitat + " estat= " +msg+ '}';
    }

    public int getIntensitat() {
        return intensitat;
    }

    public void setIntensitat(int intensitat) {

        this.intensitat = intensitat;
    }

    // metodo para comprobar si la bombeta funciona 
    void comprovarBombeta(int intensitat) {

        if (intensitat >= 5) {

            System.out.println("Bombeta cremat");
        } else if (intensitat == 0) {
            System.out.println("Bombeta apagat");
        } else {
            System.out.println("Bombeta ences");
        }

    }
    
    
    public static void  estatBombetes () {
        
        
        
       
    
    }

}
