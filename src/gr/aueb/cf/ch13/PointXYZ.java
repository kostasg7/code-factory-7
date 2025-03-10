package gr.aueb.cf.ch13;

public class PointXYZ {

    private int x;
    private int y;
    private int z;

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public PointXYZ() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getXYDistance() {
        int sqr = (x * x) + (y * y);
        return (int) Math.sqrt(sqr);
    }

    public int getYZDistance() {
        int sqr = (x * x) + (y * y);
        return (int) Math.sqrt(sqr);
    }

    public int getXZDistance() {
        int sqr = (x * x) + (y * y);
        return (int) Math.sqrt(sqr);
    }

    public int getXYZDistance() {
        int sqr = (x * x) + (y * y) + (z * z);
        return (int) Math.sqrt(sqr);
    }

    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
