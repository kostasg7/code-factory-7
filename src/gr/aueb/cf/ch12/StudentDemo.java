package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();                                 // Invoke Default Constructor
        Student bob = new Student(2, "Bob", "D.");  // Invoke Overloaded Constructor and populates

        student.setId(1);               //student.id = 1
        student.setFirstName("Alice");  //student.firstname = "Alice";
        student.setLastName("W.");      //student.lastname = "W.";

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstName());
        System.out.println("Lastname: " + student.getLastName());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstName());
        System.out.println("Lastname: " + bob.getLastName());

        System.out.println("Student instances' count" + Student.getStudentsCount());
    }
}
