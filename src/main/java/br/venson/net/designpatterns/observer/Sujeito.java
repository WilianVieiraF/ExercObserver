package br.venson.net.designpatterns.observer;

public interface Sujeito {

    void registrar(Observador observador);

    void remover(Observador observador);

    void notificar();
}