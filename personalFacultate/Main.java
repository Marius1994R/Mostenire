package com.company.personalFacultate;

public class Main {

    public static void main(String[] args) {

        Student rasbiciMarius = new Student("Rasbici Marius", "Str. Trandafirilor", 761556197, "marius.rasbici@icloud.com");
        Student gligorAndreea = new Student("Gligor Andreea", "Str. Martir Dumotru Osman", 757559844, "andre_gligor@yahoo.com");

        Persoana[] persoane = new Persoana[2];
        persoane[0] = rasbiciMarius;
        persoane[1] = gligorAndreea;


        for (int i = 0; i < persoane.length; i++ ){
            Persoana persoana = persoane[i];
            Student student = (Student) persoana;
            System.out.println(persoane[i]);
        }













    }
}
