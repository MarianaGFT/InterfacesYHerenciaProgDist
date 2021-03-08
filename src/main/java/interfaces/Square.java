package interfaces;

public class Square implements Polygon{

    public float side;
    private int sides=4;

    public Square(float side) {
        this.side=side;
    }


    @Override
    public float getArea() {
        return (float)(Math.pow(side,2));
    }

    @Override
    public int getSides() {
        return sides;
    }
}