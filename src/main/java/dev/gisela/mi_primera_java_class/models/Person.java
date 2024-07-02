package dev.gisela.mi_primera_java_class.models;

public class Person {

    private String name;
    private String lastName;
    private String dni;
    private int bornDate;
    private String country;
    private char gender;

    public Person(String name, String lastName, String dni, int bornDate, String country, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.bornDate = bornDate;
        this.country = country;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public int getBornDate() {
        return bornDate;
    }

    public String getCountry() {
        return country;
    }

    public char getGender() {
        return gender;
    }

    // public void print(){
    // System.out.println("Person: " + name + ", " + lastName + ", " + dni + "y " +
    // bornDate);
    // }

    public void print() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", bornDate=" + bornDate
                + ", country= " + country + ", gender= " + gender + "]";
    }

}

// public void printPer(){
// System.out.println("Person: " + name + ", " + lastName + ".");
// }
