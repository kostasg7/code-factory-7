package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.Point;

public class PointMain {

    public static void main(String[] args) {

//        Point point = new Point();
//        Point2D point2D = new Point2D();
//        Point3D point3D = new Point3D();
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doMovePlus10(p1);


    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point);
    }
}
