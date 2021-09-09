package TresorAufgabe;

import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstaende;

    public Tresor() {
        gegenstaende = new ArrayList<Gegenstand>();
    }
    public void addGegenstand(Gegenstand g) {
        gegenstaende.add(g);
    }
    public void removeGegenstand(Gegenstand g) throws ObjectNotFoundEx {
        if(gegenstaende.contains(g)){
            gegenstaende.remove(g);
        } else
        throw new ObjectNotFoundEx("Gegenstand nicht gefunden");
    }
    public double getValue() {
        double value = 0;
        for(int i = 0; i < gegenstaende.size(); i++){
            value += gegenstaende.get(i).getWert();
        }
        return value;
    }
    public Gegenstand getGegenstand(int id) throws ObjectNotFoundEx {
        for(int i = 0; i < gegenstaende.size(); i++){
            if (gegenstaende.get(i).getId() == id) {
                return gegenstaende.get(i);
            }
        }
        throw new ObjectNotFoundEx(id, "Kein Gegenstand mit der id: " +id+ " gefunden");
    }
    public String toString(){
        String g = "Dieser Tresor enthält: \n";
        for(int i = 0; i < gegenstaende.size(); i++){
            g += gegenstaende.get(i).toString() + "\n";
        }
        return g;
    }
}
