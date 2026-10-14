# Projeto: estação meteorológica com anti-pattern (Observer)

Estação meteorológica simplificada que publica as medições de temperatura,
umidade e pressão para vários **displays**. O código funciona, mas a estação
conhece cada display e chama seus métodos diretamente.

O objetivo deste projeto é **rastrear** o problema de design e propor uma solução
usando o padrão **Observer**. Não é um projeto pronto: o código funciona, mas o
sujeito está acoplado a cada observador concreto e não há registro dinâmico.

## Como rodar

O projeto é Maven (Java 17) e abre direto no Eclipse/IntelliJ.

- **Eclipse/IntelliJ:** importe a pasta do projeto e execute a classe `Main`.
- **Linha de comando:**
  ```bash
  mvn compile
  java -cp target/classes br.venson.net.designpatterns.observer.Main
  ```

## O cenário

- `EstacaoMeteorologica`: guarda as medições e atualiza os displays.
- `DisplayTemperatura`: mostra a temperatura atual.
- `DisplayEstatisticas`: calcula a média das temperaturas.
- `Main`: faz algumas medições e imprime o resultado.

## O que observar

1. A `EstacaoMeteorologica` **conhece** `DisplayTemperatura` e
   `DisplayEstatisticas` e suas assinaturas.
2. Cada display novo (ex.: `DisplayUmidade`) exige **editar** a estação.
3. Não é possível **registrar/remover** um display em tempo de execução.
4. A estação fica presa a **um painel específico** de displays.
5. É possível reusar a estação em outro contexto sem recompilar a classe?

## Tarefa

Rastreie os problemas de design deste código e proponha uma refatoração com o
padrão **Observer**, deixando claros os papéis: a **interface de observador**
(`Observador`), o **sujeito** (`Sujeito`, que registra e notifica) e os
**observadores concretos** (`DisplayTemperatura`, `DisplayEstatisticas`).
