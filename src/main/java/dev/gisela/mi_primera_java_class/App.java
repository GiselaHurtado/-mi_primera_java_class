package dev.gisela.mi_primera_java_class;

import dev.gisela.mi_primera_java_class.models.Person;

public class App {

    private App(){
    }

   public static void main(String[] args) {
    Person ianela = new Person("Ianela","asd","12345678D", 1990, "Argentina", 'M');
    Person louis = new Person("Louis","assd","12345672D", 1991, "Brasil", 'H');
   

        ianela.print();
        louis.print();
   
    } 
};   


        
    


// System.out.println(ianela.toString());
// System.out.println(louis.toString());



