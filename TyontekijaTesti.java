package fi.jamk;

public class TyontekijaTesti {
    
    public static void main(String args[]){
        Tyontekija siivooja = new Tyontekija("Mikko","Siivoaja",1300);
        Tyontekija kokki = new Tyontekija("Pena","Kokki",1600);
        Johtaja pomo = new Johtaja("Mersu",1500.56,"Jorma","Johtaja",5000);

        System.out.println("Työntekijöiden ja Johtajien tämänhetkiset nimet: " + siivooja.annaTiedot() + ", " + kokki.annaTiedot() + ", " + pomo.annaTiedot());
        
        kokki.setNimi("Marko");
        pomo.setAuto("BMW");
        pomo.setPalkka(10000);
        siivooja.setPalkka(900);
        
        System.out.println("\nTapahtui muutoksia, kokki vaihtoi nimeään, hänen nimensä on nykyään " + siivooja.getNimi() + "\nJohtajan palkka nousi " + pomo.getPalkka() + "euroon ja hän sai "
        + "uuden työsuhdeauton merkiltään " + pomo.getAuto() + ". \nSiivoojan palkka laski " + siivooja.getPalkka() + "euroon.");
        
    }
}
