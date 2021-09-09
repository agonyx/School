package TresorAufgabe;

public class Aktien extends Gegenstand{
    public String name;
    public double nennwert;
    public Aktien(int id, double wert, String name, double nennwert) {
        super(id, wert);
        this.name = name;
        this.nennwert = nennwert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNennwert() {
        return nennwert;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }
    public String toString(){
        return "GegenstandID = " + id +"; Wert = " + wert + "; " + "Unternehmen: " + name + "; "+ "Nennwert: " + nennwert + "; ";
    }
}
