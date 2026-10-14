package br.venson.net.designpatterns.observer;

public class DisplayTemperatura implements Observador {

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Temperatura atual: " + temperatura + "C");
    }
}