package gr.aueb.cf.ch16.exercises.exercise1;

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 6);
        AbstractShape rec2 = new Rectangle(15,3);

        System.out.println(rec2.getId());
        System.out.println(rec2.getClass().getSimpleName());
        System.out.println(rec.getArea());

    }
}
