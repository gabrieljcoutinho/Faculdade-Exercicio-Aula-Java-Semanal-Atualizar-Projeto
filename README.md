# 🏎️ Fundamentos de OO - Classes, Objetos e Associações

Este projeto demonstra a evolução de um sistema isolado para uma arquitetura baseada em **Programação Orientada a Objetos (POO)**, focando especificamente em **Associação de Classes**.

---

## 🎯 Conceitos Aplicados

Nesta etapa, o projeto deixou de ter apenas um objeto solto e passou a simular um ecossistema onde componentes colaboram entre si:

### 1. Associação (Relacionamento "Tem-Um")
O conceito central foi conectar duas classes independentes.
- **Classe Motor**: Responsável pelas especificações técnicas (combustível, potência) e pelo comportamento de ignição.
- **Classe exercicio (Carro)**: Agora possui um atributo do tipo `Motor`. O carro não apenas "existe", ele depende de um objeto motor para funcionar.

### 2. Injeção via Construtor
Diferente da versão anterior, o carro agora exige um motor no momento em que é criado. Isso garante que o objeto `meuCarro` sempre nasça em um estado funcional e completo.

### 3. Encapsulamento Rigoroso
- **Atributos Privados**: `modelo`, `cor`, `velocidadeAtual` e `motor` estão protegidos.
- **Getters e Setters**: O acesso aos dados é feito de forma controlada, com regras de negócio (como impedir velocidade negativa).

---

## 🏗️ Estrutura do Projeto

O sistema é dividido em dois arquivos que trabalham em conjunto:

| Arquivo | Papel na POO | Responsabilidade |
| :--- | :--- | :--- |
| `Motor.java` | Classe Associada | Gerencia a potência e a ação `darPartida()`. |
| `exercicio.java` | Classe Principal | Orquestra o veículo e interage com o motor. |

---

## 💻 Demonstração de Execução

Ao executar a classe principal, o fluxo seguido é:
1. Instanciação de um motor V8 de 450 CV.
2. Criação de um Mustang associado a este motor.
3. **Comunicação**: O objeto Carro acessa o método `darPartida()` do seu objeto Motor.

---

## 🚀 Como executar

Como os arquivos possuem dependências entre si, siga estes passos no terminal dentro da pasta `/classes`:

1. **Compilar os arquivos:**
   ```bash
   javac Motor.java exercicio.java