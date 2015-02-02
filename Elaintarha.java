
package fi.jamk;

/**
 *
 * @author Mythe
 */
public class Elaintarha {
    
    private String nimi;
    private String paikkakunta;
    Tyontekija tyontekija[];
    Elain elain[];
    Asiakas asiakas[];

    public Elaintarha(String nimi, String paikkakunta) {
        this.nimi = nimi;
        this.paikkakunta = paikkakunta;
    }
    
   public String getAll() {
       return "Eläintarha nimeltä " + this.nimi + " sijaitsee paikkakunnalla " + this.paikkakunta + "\nEläintarhassa on seuraavia eläimiä: " + elain[0].getAll() + elain[1].getAll() + elain[2].getAll() + "\n Siellä työskentelee seuraavat työntekijät:" + tyontekija[0].annaTiedot() + tyontekija[1].annaTiedot() + tyontekija[2].annaTiedot() + "\nJa siellä on tällä hetkellä seuraavat asiakkaat: " + asiakas[0].getAsiakas() + asiakas[1].getAsiakas();
   }
}
