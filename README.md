# Consulta de CEP com Java

Este projeto é um programa simples em Java que permite ao usuário consultar informações de endereço a partir de um CEP (Código de Endereçamento Postal) utilizando a API pública do ViaCEP. Além disso, o programa gera um arquivo JSON com os dados do endereço retornado.

---

## 🛠️ Funcionalidades

- Consulta de endereço a partir de um CEP.
- Exibição das informações do endereço no console.
- Geração de um arquivo JSON contendo os dados do endereço.

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**: Linguagem principal utilizada no projeto.
- **HTTP Client**: Para realizar requisições HTTP.
- **Gson**: Biblioteca para manipulação de JSON.
- **API ViaCEP**: Para obter os dados de endereço.

---

## 📂 Estrutura do Projeto

- **`Principal`**: Classe principal responsável por iniciar a aplicação e interagir com o usuário.
- **`ConsultaCep`**: Classe que realiza a consulta do CEP na API do ViaCEP.
- **`Endereco`**: Classe `record` que representa os dados de um endereço.
- **`GeradorDeArquivo`**: Classe responsável por salvar os dados do endereço em um arquivo JSON.

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos:
- JDK 17+ instalado.
- Editor de código (como IntelliJ IDEA, VS Code ou Eclipse).

### Passos:
1. Clone ou baixe este repositório.
2. Abra o projeto em seu editor de código preferido.
3. Compile e execute a classe `Principal`.

---

## 📋 Exemplo de Uso

### Entrada:
O usuário insere um CEP para consulta:
```text
Digite um número de CEP para consulta:
05664015
