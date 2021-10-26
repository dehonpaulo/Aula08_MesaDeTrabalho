package modelo.impl;

import modelo.Figura;

public class Circulo extends Figura {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularPerimetro() {
        return 2.00 * Math.PI * this.raio;
    }
}
