package modelo.impl;

import modelo.Figura;

public class Quadrado extends Figura {
    private Double altura;
    private Double largura;

    public Quadrado(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2.00*altura + 2.00*largura;
    }
}
