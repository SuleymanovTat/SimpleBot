package ru.suleymanovtat.tasks;

public class User {

    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        String first = firstName == null ? "" : firstName + " ";
        String last = lastName == null ? "" : lastName + " ";
        String fullName = first + last;
        return fullName.isEmpty() ? "Unknown" : fullName;
    }
}
