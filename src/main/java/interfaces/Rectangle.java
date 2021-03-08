package interfaces;

public class Rectangle implements  Polygon{

    public float h;
    public float b;
    private int sides=4;

    public Rectangle(float h, float b) {
        this.h=h;
        this.b=b;
    }


    @Override
    public float getArea() {
        return (float) (b*h);
    }

    @Override
    public int getSides() {
        return sides;
    }
}