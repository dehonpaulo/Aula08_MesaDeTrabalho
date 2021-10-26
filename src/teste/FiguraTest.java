package teste;

import modelo.impl.Circulo;
import modelo.impl.Quadrado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiguraTest {

    @Test
    public void calcularPerimetroCirculo() {
        Double raio = 10.50;
        Double resultadoEsperado = 2 * Math.PI * raio;

        Circulo circulo = new Circulo(raio);
        Double resultadoObtido = circulo.calcularPerimetro();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void calcularPerimetroQuadrado() {
        Double resultadoEsperado = 41.00;

        Quadrado quadrado = new Quadrado(10.50, 10.00);
        Double resultadoObtido = quadrado.calcularPerimetro();

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
}
