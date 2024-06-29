package dev.gisela.mi_primera_java_class;

import dev.gisela.mi_primera_java_class.models.Person;

public class App {


   public static void main(String[] args) {
    Person ianela = new Person("ianela","asd","12345678D", 1990);
    Person louis = new Person("luois","sfsdsd", "87654321L", 1992);

   

ianela.print();
louis.print();

// System.out.println(ianela.toString());
// System.out.println(louis.toString());

}
};

