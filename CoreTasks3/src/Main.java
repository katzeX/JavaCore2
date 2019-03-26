public class Main  {

    public static void main(String[] args) {

        Square square1 = new Square(4);
        System.out.println("Area: "  + square1.area());
        System.out.println("Perimeter: " + square1.calculatePerimeter());


        Circle circle1 = new Circle(2);
        System.out.println("Area: " + circle1.area());
        System.out.println("Perimeter: " + circle1.calculatePerimeter());

        Student student1 = new Student("John Lala" , 25);
        Student student2 = new Student("Irene Lala", 30);

        System.out.println( ( student1.getAge() + student2.getAge() ) / 2 );
    }

}
