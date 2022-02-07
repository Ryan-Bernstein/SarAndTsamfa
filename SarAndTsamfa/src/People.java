public class People {
    private double height;

    private boolean hasBrain = false;

    public People(double _height, boolean _hasBrains){
        height = _height;
        hasBrain = _hasBrains;
    }

    public double getHeight() {
        return height;
    }


    public boolean isHasBrain() {
        return hasBrain;
    }


}
