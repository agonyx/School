package TresorAufgabe;

public class ObjectNotFoundEx extends Exception {

    private int gegenstandsID;
    public ObjectNotFoundEx(int gegenstandsID,String message) {
        super(message);
        this.gegenstandsID = gegenstandsID;
    }

    public ObjectNotFoundEx(String message) {
        super(message);
    }

    public ObjectNotFoundEx(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundEx(Throwable cause) {
        super(cause);
    }

    public ObjectNotFoundEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
