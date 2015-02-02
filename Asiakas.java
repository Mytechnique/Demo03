package fi.jamk;

/**
 *
 * @author Mythe
 */
public class Asiakas {
    
    private String nimi;
    private int ika;

    public Asiakas(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }
    
    public String getAsiakas() {
        return "\n\nAsiakkaan nimi on: " + this.nimi + " ja hän on " + this.ika + " vuotias.";
    }
}
