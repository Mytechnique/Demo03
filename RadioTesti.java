package fi.jamk;

import java.util.Scanner;

public class RadioTesti {
    public static void main(String args[]) {
        Radio radio = new Radio(0,0,0);
        Scanner scan = new Scanner(System.in);
        int voimakkuus, onoff;
        double taajuus;
        
        // Kysytään arvot käyttäjältä
        System.out.println(radio.getOnoff());
        System.out.println("\nRadio menee päälle arvolla 1 ja pois päältä arvolla 0. Aseta arvo: ");
        onoff = scan.nextInt();
        radio.setOnoff(onoff);
        
        System.out.println("\nVoit asettaa taajuuden välille 2000.0 - 26000.0 Aseta taajuus: ");
        taajuus = scan.nextInt();
        radio.setTaajuus(taajuus);
        
        System.out.println("\nVoit asettaa voimakkuuden välilleä 0-9. Aseta radion voimakkuus: ");
        voimakkuus = scan.nextInt();
        radio.setVoimakkuus(voimakkuus);
        
        System.out.println(radio.getOnoff()+ " " + radio.getTaajuus() + " ja " + radio.getVoimakkuus());
        
    }
}
