package HW5;

public class Main {
    public static void main(String[] args) {

        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println("a1: " + a1.getX());
        System.out.println("a2: " + a2.getX());
        a1.setX(8);
        System.out.println("a1(2): " + a1.getX());
        System.out.println("a2(2): " + a2.getX());
        Point[] point = new Point[4];
        point[0] = new Point(2, 4);
        point[1] = new Point(5, 8);
        point[2] = new Point(6, 9);
        point[3] = new Point(5, 3);
        for (Point points : point) {
            points.info();
        }
        System.out.println("Points 2: ");
        for (Point points : point) {
            if (points.getX() % 2 == 0 && points.getY() % 2 == 0) {
                points.info();
            }
        }
    }
}
