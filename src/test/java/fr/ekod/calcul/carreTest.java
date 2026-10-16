package fr.ekod.calcul;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class carreTest {

    @Test
    void carreEgaleZero () {
        assertEquals(0, Nombre.carre(0));
    }

    @Test
    void carreValeurNegative () {
        assertTrue(Nombre.carre(-6)>0);
    }

}
