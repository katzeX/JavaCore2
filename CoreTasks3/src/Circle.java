public class Circle extends GraphicObject {

    double radius;

    Circle( double radius )
    {
        this.radius = radius;
    }



    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

}
