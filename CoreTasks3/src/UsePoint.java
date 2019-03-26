public class UsePoint {
    public  static  void  main(String[] args){
        Point point = new Point();
        point.setX(1);
        point.setY(2);
        point.setZ(3);


        System.out.println(point.getX() + " " + point.getY() + " " + point.getZ());

        Point point1 = new Point(4, 5 , 6);
        System.out.println(point1.getX() + " " + point1.getY() + " " +  point1.getZ());

        Point point2 = new Point(7, 8);
        System.out.println(point2.getX() + " " +  point2.getY());
    }

}
