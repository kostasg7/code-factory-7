package gr.aueb.cf.ch13;

public class PointMain {

    public static void main(String[] args) {

        PointXYZ p = new PointXYZ(5, 10, 10);
        System.out.println(p.convertToString());
        System.out.println(p.getXYDistance() + ", " + p.getXYZDistance());
    }
}
