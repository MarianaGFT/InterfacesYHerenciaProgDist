package interfaces;

public class Circle implements  Polygon{

    public float radio;
    private int sides=1;

    public Circle(float radio) {
        this.radio=radio;
    }

    @Override
    public float getArea() {
        return (float) (3.14159265 * Math.pow(radio,2));
    }

    @Override
    public int getSides() {
        return sides;
    }
}