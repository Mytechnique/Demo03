package fi.jamk;

public class ElaintarhaTesti {
    
    public static void main(String args[]) {
        
        Elaintarha elaintarha = new Elaintarha("Korkeasaari","Helsinki");
        elaintarha.elain = new Elain[3];
        elaintarha.elain[0] = new Elain("Maatiaiskissa",10,4,30.5,"Kissalaakso");
        elaintarha.elain[1] = new Elain("Kaupunkikissa",7,6,27.34,"Kissalaakso");
        elaintarha.elain[2] = new Elain("Supikoira",70,11,68.44,"Koirapalatsi");
        elaintarha.asiakas = new Asiakas[2];
        elaintarha.asiakas[0] = new Asiakas("Pertti",67);
        elaintarha.asiakas[1] = new Asiakas("Mirkku",15);
        elaintarha.tyontekija = new Tyontekija[3];
        elaintarha.tyontekija[0] = new Tyontekija("Martti","Siivooja",1400);
        elaintarha.tyontekija[1] = new Tyontekija("Pekka","Eläintenhoitaja",1800);
        elaintarha.tyontekija[2] = new Tyontekija("Siiri","Eläintenhoitaja",1700);
        System.out.println(elaintarha.getAll());
        
        
    }
}
