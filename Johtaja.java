package fi.jamk;

public class Johtaja extends Tyontekija {
    
    private String auto;
    private double bonus;

    public Johtaja(String auto, double bonus, String nimi, String asema, double palkka) {
        super(nimi, asema, palkka);
        this.auto = auto;
        this.bonus = bonus;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public String annaTiedot() {
        return "\n" + super.annaTiedot() +"Johtajan auto on: " + this.auto + ", johtaja saa bonusta: " + this.bonus + "euroa";
}
}
