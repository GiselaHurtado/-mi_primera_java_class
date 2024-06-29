package dev.gisela.mi_primera_java_class.models;

public class Person {
    
    private String name;
    private String lastName;
    private String dni;
    private int bornDate;

    public Person(String name, String lastName, String dni, int bornDate) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.bornDate = bornDate;
    }


    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

   public String getDni(){
   return dni;
   }

   public int getBornDate(){
    return bornDate;
   }


//    public void print(){
//    System.out.println("Person: " + name + ", " + lastName + ", " + dni + "y " + bornDate);
//    }

public void print(){
    System.out.println(this.toString());

}

   @Override
   public String toString(){
    return "Person [name= " + ", lastName=" + "]";
   }

}


//    public void printPer(){
//     System.out.println("Person: " + name + ", " + lastName + ".");
//    }


