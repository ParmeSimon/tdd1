package fr.ekod.calcul;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class puissanceTest {

    @Test
    void calculeRightNumber () {
        assertEquals(216, Nombre.puissance(6,3));
    }

    @Test
    void exposantZero () {
        assertEquals(1, Nombre.puissance(485225,0));
    }


}

