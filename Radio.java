package fi.jamk;

public class Radio {
    
    private final int voimakkuusmax = 9;
    private final int voimakkuusmin = 0;
    private int voimakkuus;
    
    private final double taajuusmax = 26000.0;
    private final double taajuusmin = 2000.0;
    private double taajuus;
    
    private final int onoffmax = 1;
    private final int onoffmin = 0;
    private int onoff;

    public Radio(int voimakkuus, double taajuus, int onoff) {
        this.voimakkuus = voimakkuus;
        this.taajuus = taajuus;
        this.onoff = onoff;
    }

    public String getVoimakkuus() {
        if(voimakkuus >= voimakkuusmin && voimakkuus <= voimakkuusmax) {
        return "radion voimakkuus on tällä hetkellä " + voimakkuus;
    }else
        return "Et voi käyttää voimakkuutta " + voimakkuus + ", syötä uusi arvo 0-9 väliltä.";
    }

    public void setVoimakkuus(int voimakkuus) {
        this.voimakkuus = voimakkuus;
    }

    public String getTaajuus() {
    if(taajuus >= taajuusmin && taajuus <= taajuusmax) {
        return "Taajuutesi on tällä hetkellä " + taajuus;
    }else
        return "Et voi käyttää taajuutta " + taajuus + ", syötä uusi taajuus 2000.0 - 26000.0 väliltä.";
    }

    public void setTaajuus(double taajuus) {
        this.taajuus = taajuus;
    }

    public String getOnoff() {
        if(onoff == 0) {
        return "Radio on pois päältä";
        } else
        return "Radio on päällä!";
    }

    public void setOnoff(int onoff) {
        this.onoff = onoff;
    }
    
    
}
