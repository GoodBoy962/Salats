package cells;

public class EmptyCell implements Cell {

    double x;
    double y;


    private boolean isEmpty = true;

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

}
