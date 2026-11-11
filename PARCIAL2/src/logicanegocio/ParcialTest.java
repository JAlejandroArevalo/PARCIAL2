package logicanegocio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParcialTest {

    Parcial parcial = new Parcial();

    @Test
    void dosRaicesReales() {
        assertEquals("x=3.0, x=2.0", parcial.calcularRaices(1, -5, 6));
    }

    @Test
    void raizDoble() {
        assertEquals("x=-1.0, x=-1.0", parcial.calcularRaices(1, 2, 1));
    }

    @Test
    void aIgualACero() {
        assertEquals("Error: 'a' no puede ser 0, la ecuación no es de segundo orden.",
                parcial.calcularRaices(0, 2, 1));
    }

    @Test
    void raicesComplejas() {
        assertEquals("Error: El discriminante es negativo, las raíces son complejas.",
                parcial.calcularRaices(1, 0, 1));
    }

    @Test
    void valorNoNumerico() {
        assertEquals("Error: Los valores ingresados no son válidos o son demasiado grandes.",
                parcial.calcularRaices(Double.NaN, 1, 1));
    }

    @Test
    void valoresDemasiadoGrandes() {
        assertEquals("Error: Los valores ingresados no son válidos o son demasiado grandes.",
                parcial.calcularRaices(1e200, 1e200, 1));
    }
}