package TresorAufgabe;

public abstract class Gegenstand {
    protected int id;
    protected double wert;

    public Gegenstand(int id, double wert) {
        this.id = id;
        this.wert = wert;
    }

    public int getId() {
        return id;
    }
    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }
    public String toString() {
        return "GegenstandID = " + id+"; Wert = " + wert + "; ";
    }
}
