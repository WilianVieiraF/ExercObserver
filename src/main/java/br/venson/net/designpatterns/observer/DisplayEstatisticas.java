package br.venson.net.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DisplayEstatisticas implements Observador {

    private final List<Double> historico = new ArrayList<>();

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        historico.add(temperatura);
        double soma = historico.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Media das temperaturas: " + (soma / historico.size()) + "C");
    }
}