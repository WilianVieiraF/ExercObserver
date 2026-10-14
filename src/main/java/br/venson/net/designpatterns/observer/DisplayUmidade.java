package br.venson.net.designpatterns.observer;

public class DisplayUmidade implements Observador {

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Umidade atual: " + umidade + "%");
    }
}