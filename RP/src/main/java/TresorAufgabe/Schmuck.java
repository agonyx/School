package TresorAufgabe;

public class Schmuck extends Gegenstand{
    private String bezeichnung;
    public Schmuck(int id, double wert,String bezeichnung) {
        super(id, wert);
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    public String toString(){
        return "GegenstandID = " + id +"; Wert = " + wert + "; " + "Bezeichnung: " + bezeichnung + "; ";
    }
}
