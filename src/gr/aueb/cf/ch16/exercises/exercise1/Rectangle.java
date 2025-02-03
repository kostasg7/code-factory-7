package gr.aueb.cf.ch16.exercises.exercise1;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }



    @Override
    public Long getId() {
        return 0L;
    }
}
