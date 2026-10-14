package br.venson.net.designpatterns.observer;

public class Main {

    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        DisplayTemperatura displayTemperatura = new DisplayTemperatura();
        DisplayEstatisticas displayEstatisticas = new DisplayEstatisticas();

        estacao.registrar(displayTemperatura);
        estacao.registrar(displayEstatisticas);

        System.out.println("--- Medicao 1 ---");
        estacao.setMedicoes(25.0, 60.0, 1013.0);

        System.out.println("--- Medicao 2 ---");
        estacao.setMedicoes(27.0, 55.0, 1010.0);

        // Novo display adicionado em tempo de execucao, sem tocar na estacao.
        DisplayUmidade displayUmidade = new DisplayUmidade();
        estacao.registrar(displayUmidade);

        System.out.println("--- Medicao 3 (com DisplayUmidade) ---");
        estacao.setMedicoes(30.0, 50.0, 1008.0);

        // Display removido em tempo de execucao.
        estacao.remover(displayEstatisticas);

        System.out.println("--- Medicao 4 (sem DisplayEstatisticas) ---");
        estacao.setMedicoes(28.0, 52.0, 1009.0);
    }
}