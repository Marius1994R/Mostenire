package com.company.personalFacultate;

import java.util.Date;

public class Angajat extends Persoana{


    private String desk;
    private double salary;
    MyDate hiringDate;

    public Angajat(String name, String address, long phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(MyDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "desk='" + desk + '\'' +
                ", salary=" + salary +
                ", hiringDate=" + hiringDate +
                '}';
    }
}
