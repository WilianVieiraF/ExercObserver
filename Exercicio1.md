# Observer Pattern

## Exercício 1: Aplicações

### 1. Estação meteorológica com vários displays

**Faz sentido usar Observer.**

A estação meteorológica pode avisar automaticamente todos os displays quando novas medições estiverem disponíveis. Assim, novos displays podem ser adicionados sem precisar modificar a classe da estação, reduzindo o acoplamento entre eles.

### 2. Interface gráfica com listeners e views

**Faz sentido usar Observer.**

O padrão permite que vários listeners recebam notificações quando um botão é acionado ou quando o modelo sofre alguma alteração. Dessa forma, é possível adicionar novos interessados sem precisar modificar diretamente o modelo.

### 3. Newsletter com assinantes variáveis

**Faz sentido usar Observer.**

Cada assinante pode se cadastrar para receber as novidades e cancelar a inscrição quando quiser. O padrão facilita o envio de notificações para vários assinantes sem que a newsletter precise conhecer cada um individualmente.

### 4. Classe Configuracao com um único consumidor fixo

**Não faz sentido usar Observer.**

Como existe apenas um consumidor fixo e os valores são consultados diretamente, não há necessidade de um sistema de notificações. Utilizar Observer nesse caso aumentaria a complexidade do código sem trazer benefícios significativos.

### 5. Classe Ponto que apenas guarda coordenadas

**Não faz sentido usar Observer.**

A classe `Ponto` apenas armazena as coordenadas `x` e `y` e não precisa avisar outras classes quando elas mudam. Implementar Observer seria desnecessário, pois adicionaria complexidade a uma classe que possui uma responsabilidade simples.