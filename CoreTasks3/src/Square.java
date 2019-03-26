public class Square extends  GraphicObject {

    double sideLength;

    Square(){}
    Square( double sideLength)
    {
        this.sideLength = sideLength;
    }

    public double area()
    {
        return Math.pow(sideLength, 2);
    }
    public double calculatePerimeter()
    {
        return 4 * sideLength;
    }
}
