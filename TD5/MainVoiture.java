package TD5;

import java.util.ArrayList;

public class MainVoiture {

    public static void main(String[] args) {
        Voiture voiture = new VoitureMoteurDiesel(new VoitureMoteurEssence(new VoitureFreinDisque(new Chassis())));
        System.out.println("voiture" + voiture);
        Fiche fiche1 = new Fiche(500, 20);
        Fiche fiche2 = new Fiche(300, 30);
        ArrayList<Fiche> fiches = new ArrayList<>();
        fiches.add(fiche1);
        fiches.add(fiche2);
        fiches.sort();
    }
}
