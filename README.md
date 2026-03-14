# Fundamentos de OO - Classes e Objetos

Este projeto é um exercício prático desenvolvido em Java para demonstrar os pilares básicos da **Programação Orientada a Objetos (POO)**. O foco principal foi a criação de uma classe para representar um objeto do mundo real e a manipulação de seus estados.

---

## 🎯 Conceitos Aplicados

Nesta atividade, trabalhamos com a estrutura fundamental de uma classe:

### 1. Como o objeto é: (**Características / Atributos**)
Os atributos definem o estado do objeto. No código, representamos um carro com:
- **Modelo**: O nome do veículo.
- **Cor**: A cor característica.
- **Velocidade Atual**: O estado numérico do movimento em tempo real.

### 2. O que ele faz: (**Ações / Métodos**)
Os métodos definem o comportamento do objeto. Implementamos:
- **Acelerar**: Incrementa a velocidade atual em 10 km/h.
- **Frear**: Decrementa a velocidade atual em 10 km/h.

---



## 💻 Estrutura do Código

O arquivo `exercicio.java` segue a seguinte lógica:

1. **Instanciação**: Criação do objeto `meuCarro` a partir da classe `exercicio`.
2. **Atribuição**: Definição dos valores iniciais (Fusca, Azul, 0 km/h).
3. **Execução**: Chamada dos métodos para observar a mudança de comportamento no console.

---

## 🚀 Como executar o projeto

1. Certifique-se de ter o **JDK** instalado.
2. Compile o arquivo:
   ```bash
   javac exercicio.java

