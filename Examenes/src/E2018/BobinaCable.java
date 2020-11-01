package E2018;

/**
 *
 * @author sorwarhussian
 */
public class BobinaCable {
    
    private int metres;
    private double seccio,preu;
    private  String buida; 

    public BobinaCable(int metres, double seccio, double preu, String buida) {
        this.metres = metres;
        this.seccio = seccio;
        this.preu = preu;
        this.buida = buida;
    }

    public int getMetres() {
        return metres;
    }

    public void setMetres(int metres) {
        this.metres = metres;
    }

    public double getSeccio() {
        return seccio;
    }

    public void setSeccio(double seccio) {
        this.seccio = seccio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getBuida() {
        return buida;
    }

    @Override
    public String toString() {
        return "metres=" + metres + ", seccio=" + seccio + ", preu=" + preu + ", buida=" + buida + '}';
    }

    public void setBuida(String buida) {
        this.buida = buida;
    }

    void getMetres(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
