package dev.gisela.mi_primera_java_class.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test
    void testPersonHasAttributes() {

        Person carla = new Person("Carla","Par","12345678N",22081991);
        assertEquals(4, carla.getClass().getDeclaredFields().length);

    }

    @Test
    void testGetName() {

        Person Carla = new Person("Carla","Par","12345678N", 22081991);
        assertEquals("Carla", Carla.getName());

    }

    @Test
    void testGetLastName() {

        Person Carla = new Person("Carla","Par", "12345678N", 22081991);
        assertEquals("Par", Carla.getLastName());

    }

    @Test
    void testGetDni() {

        Person Carla = new Person("Carla","Par", "12345678N", 22081991);
        assertEquals("12345678N", Carla.getDni());

    }

    @Test
    void testGetBornDate() {

        Person Carla = new Person("Carla","Par", "12345678N", 22081991);
        assertEquals(22081991, Carla.getBornDate());

    }
}
