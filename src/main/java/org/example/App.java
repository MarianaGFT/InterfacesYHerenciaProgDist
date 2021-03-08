package org.example;

import interfaces.Circle;
import interfaces.Polygon;
import interfaces.Rectangle;
import interfaces.Square;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Polygon circle=new Circle(5);
        Polygon rectangle=new Rectangle(3.5F, 1.2F);
        Polygon square=new Square(5);

        System.out.println( "Área del círculo: "+circle.getArea()+", Lados del círculo: "+circle.getSides());
        System.out.println( "Área del rectángulo: "+rectangle.getArea()+", Lados del rectángulo: "+rectangle.getSides());
        System.out.println( "Área del Cuadrado: "+square.getArea()+", Lados del cuadrado: "+square.getSides());

    }
}
