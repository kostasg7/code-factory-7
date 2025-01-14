package gr.aueb.cf.bankapp.model;

/**
 * An account that allows 20% overdraft of the balance.
 */
public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public OverdraftAccount() {
    }

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Checks if the amount is over 20% of balance and
     * withdraws the amount if it is not.
     *
     * @param amount        the amount to be withdrawn
     * @param ssn           the given ssn
     * @throws Exception    if the ssn is not valid or the amount
     *                      is greater than 20% of the balance.
     */
    public void withdrawal(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("SSN " + ssn + " is not valid.");
            }
            if (balance * 1.20 < amount) {
                throw new Exception("The amount " + amount + " must not be over 20% of balance.");
            }
        balance -= amount;
        } catch (Exception e) {
            System.out.println("The amount " + amount + " must not be over 20% of balance.");
            throw e;
        }
    }

    public boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
