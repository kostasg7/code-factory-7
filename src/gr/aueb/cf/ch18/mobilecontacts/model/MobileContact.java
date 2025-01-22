package gr.aueb.cf.ch18.mobilecontacts.model;

import java.util.Objects;

public class MobileContact extends AbstractEntity{
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContact() {
    }

    public MobileContact(String firstname, String lastname, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Firstname: " + firstname + ", Lastname: " + lastname + ", Phone NUmber: " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobileContact that)) return false;
        return Objects.equals(getFirstname(), that.getFirstname())
                && Objects.equals(getLastname(), that.getLastname())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPhoneNumber());
    }
}
