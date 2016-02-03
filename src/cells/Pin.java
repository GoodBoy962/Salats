package cells;

public class Pin implements Cell {

    double x;
    double y;

    long id;
    float name;

    public Pin(double x, double y, long id, float name) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
}
