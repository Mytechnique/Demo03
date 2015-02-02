
package fi.jamk;

/**
 *
 * @author Mythe
 */
public class Elain {
    
    private String laji;
    private int paino;
    private int ika;
    private double pituus;
    private String sijainti;

    public Elain(String laji, int paino, int ika, double pituus, String sijainti) {
        this.laji = laji;
        this.paino = paino;
        this.ika = ika;
        this.pituus = pituus;
        this.sijainti = sijainti;
    }

    public String getLaji() {
        return laji;
    }

    public void setLaji(String laji) {
        this.laji = laji;
    }

    public int getPaino() {
        return paino;
    }

    public void setPaino(int paino) {
        this.paino = paino;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }
    
    public String getAll() {
        return "\n\nLaji: " + this.laji + "\nIkä: " + this.ika + "\nPituus: " + this.pituus + "\nPaino: " + this.paino + "\nSijainti eläintarhassa: " + this.sijainti;
    }
    
    
}
