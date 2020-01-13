package ru.suleymanovtat.employeses;

public class DataAnalyst extends Employee {

    boolean phd;
    String[] mlMethods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] mlMethods) {
        super(name, email, experience);
        this.phd = phd;
        this.mlMethods = mlMethods;
    }

    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return mlMethods;
    }
}
