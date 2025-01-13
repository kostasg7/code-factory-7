package gr.aueb.cf.bankapp.model;

public class Main {

    public static void main(String[] args) {

        OverdraftAccount kostas = new OverdraftAccount(100, "GR12345", "Kostas",
                "Papadopoulos", "123", 500);

        try {
            kostas.withdrawal(601, "123");
            System.out.println(kostas.getBalance());
        } catch (Exception e) {
            e.getMessage();
        }



    }
}
