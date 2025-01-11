package gr.aueb.cf.model;

public class Main {

    public static void main(String[] args) {
        User kostas = new User(100, "Kostas", "Papadopoulos");
        User sophia = new User(200, "Sophia", "Koutsioglou");
        UserCredentials kostasCredentials = new UserCredentials(100, "kostasUsername", "kostasPass");
        UserCredentials sophiaCredentials = new UserCredentials(200, "sophiaCredentials", "sophiaPass");

        System.out.println("{" + kostas.getId() + "," + " " + kostas.getFirstname() + "," + " " + kostas.getLastname() + "}");
        System.out.println("{" + kostasCredentials.getId() + "," + " " + kostasCredentials.getFirstname() + "," + " " + kostasCredentials.getLastname() + "}");
    }
}
