package com.company.personalFacultate;

public class Student extends Persoana{


    StatutClasa statutClasa;

    public Student(String name, String address, long phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }

    public StatutClasa getStatutClasa() {
        return statutClasa;
    }

    public void setStatutClasa(StatutClasa statutClasa) {
        this.statutClasa = statutClasa;
    }

    @Override
    public String toString() {
        return "Studentult: " + getName() +
                " are statutul de: " + statutClasa;
    }
}
