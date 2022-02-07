public class Sar extends People{

    private boolean angry = false;
    private boolean irritable= false;
    private boolean maryJane;

    public Sar(double _height, boolean _hasBrains, boolean maryJane) {
        super(_height, _hasBrains);
        this.maryJane = maryJane;
    }

    public boolean isMaryJane() {
        return maryJane;
    }

    public void setIrritable(boolean irritable) {
        this.irritable = irritable;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
    }

    public boolean getScary(){
        return angry && irritable;
    }
}
