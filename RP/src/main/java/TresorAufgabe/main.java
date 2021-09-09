package TresorAufgabe;

public class main {
    public static void main(String[] args) {
        try{
            Tresor tresor = new Tresor();
            Schmuck schmuck = new Schmuck(1, 200 , "Gucci-Halskette");
            Aktien aktie = new Aktien(2, 1000, "Valve", 600);
            tresor.addGegenstand(schmuck);
            tresor.removeGegenstand(aktie);
            System.out.println(tresor.toString());
            System.out.println(tresor.getValue());
            System.out.println(tresor.getGegenstand(3));
        }catch (ObjectNotFoundEx e){
            e.printStackTrace();
        }

    }
}
