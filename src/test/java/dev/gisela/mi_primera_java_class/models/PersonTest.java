package dev.gisela.mi_primera_java_class.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test
    void testPersonHasAttributes() {

        Person carla = new Person("Carla");
        assertEquals(1, carla.getClass().getDeclaredFields().length);

    }

    @Test
    void testGetName() {

        Person Carla = new Person("Carla");
        assertEquals("Carla", Carla.getName());

    }
}
