package br.venson.net.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Sujeito {

    private final List<Observador> observadores = new ArrayList<>();

    private double temperatura;
    private double umidade;
    private double pressao;

    @Override
    public void registrar(Observador observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    @Override
    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        // Copia defensiva: permite que um observador se remova durante a notificacao.
        for (Observador observador : new ArrayList<>(observadores)) {
            observador.atualizar(temperatura, umidade, pressao);
        }
    }

    public void setMedicoes(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificar();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public double getPressao() {
        return pressao;
    }
}