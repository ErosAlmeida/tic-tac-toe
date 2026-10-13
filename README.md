# 🎮 Tic-Tac-Toe — Jogo da Velha em Java

## 📌 Sobre o projeto

Este projeto implementa o clássico **Jogo da Velha (Tic-Tac-Toe)** em Java, executado pelo terminal.

O objetivo é praticar os fundamentos da linguagem Java e aplicar conceitos de programação orientada a objetos na construção de uma aplicação funcional, organizada e de fácil manutenção.

Além da mecânica tradicional do jogo, o projeto conta com um sistema de pontuação que registra as vitórias em um arquivo, permitindo consultar resultados de partidas anteriores.

## ✨ Funcionalidades

- 👥 **Dois jogadores:** partidas entre dois participantes.
- ❌ **Símbolos X e O:** cada jogador possui seu próprio símbolo.
- 🎯 **Validação de jogadas:** tratamento de jogadas inválidas.
- 🏆 **Detecção de vitória:** identificação de sequências vencedoras.
- 🤝 **Detecção de empate:** encerramento quando o tabuleiro fica completo sem vencedor.
- 📊 **Sistema de pontuação:** consulta e registro de vitórias por jogador.
- 💾 **Persistência em arquivo:** armazenamento das pontuações em `pontuacao.txt`.
- 🔄 **Reutilização de dados:** consulta ao histórico de vitórias em novas partidas.

## 🛠️ Tecnologias e conceitos

**Tecnologia principal**

- Java

**Conceitos aplicados**

- Programação Orientada a Objetos (POO)
- Classes, objetos, atributos e métodos
- Encapsulamento
- Interfaces
- Listas e coleções com `List` e `ArrayList`
- Mapas com `Map` e `HashMap`
- Estruturas de repetição e decisão
- Tratamento de exceções
- Manipulação de arquivos
- Leitura e escrita de dados
- Separação de responsabilidades entre classes

## ▶️ Como executar

### Pré-requisitos

- JDK instalado.
- IDE Java, como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java; ou um terminal.

### Passo a passo

**1. Clone o repositório**

```bash
git clone https://github.com/ErosAlmeida/tic-tac-toe.git
```

**2. Entre na pasta do projeto**

```bash
cd tic-tac-toe
```

**3. Abra o projeto na sua IDE Java**

Execute a classe que contém o método `main`, caso esteja presente na estrutura do projeto.

> **Observação:** ajuste o nome do repositório no comando de clone caso ele esteja publicado com outro nome. Se o projeto não tiver um método `main`, será necessário executar a classe de entrada utilizada pela aplicação.

## 🎲 Como jogar

1. Informe o nome do primeiro jogador, que utilizará o símbolo **X**.
2. Informe o nome do segundo jogador, que utilizará o símbolo **O**.
3. Em cada turno, o jogador informa a posição desejada no tabuleiro.
4. O jogo valida a jogada e verifica se existe uma sequência vencedora.
5. A partida termina quando um jogador vence ou quando ocorre um empate.
6. Quando há um vencedor, sua pontuação é atualizada e salva em arquivo.

## 📂 Organização do projeto

O projeto possui classes com responsabilidades específicas, como:

| Classe                        | Responsabilidade                                                                 |
| ----------------------------- | -------------------------------------------------------------------------------- |
| `Jogo`                        | Controla o fluxo da partida e a alternância entre jogadores.                     |
| `Tabuleiro`                   | Gerencia e exibe o tabuleiro, além de verificar jogadas e sequências vencedoras. |
| `Jogador`                     | Representa um jogador e seu símbolo.                                             |
| `Jogada`                      | Representa e interpreta a posição escolhida pelo jogador.                        |
| `Console`                     | Centraliza a leitura de dados informados pelo usuário.                           |
| `GerenciadorPontuacao`        | Define as operações disponíveis para gerenciar pontuações.                       |
| `GerenciadorPontuacaoArquivo` | Consulta e persiste as pontuações em arquivo.                                    |

*Os nomes e as responsabilidades acima refletem a implementação atual do projeto; a estrutura completa pode variar conforme a organização dos pacotes.*

## 📚 Objetivo de aprendizado

Este projeto faz parte da minha prática com Java e tem como objetivo consolidar conhecimentos fundamentais da linguagem por meio de uma aplicação prática.

Durante o desenvolvimento, exercito a organização do código em classes, a separação de responsabilidades, o tratamento de erros e a persistência de dados, buscando escrever código cada vez mais claro e organizado.

## 🚀 Próximas melhorias

- [ ] Melhorar a experiência visual no terminal.
- [ ] Adicionar testes automatizados.
- [ ] Aprimorar as validações de entrada.
- [ ] Expandir as funcionalidades do sistema de pontuação.

## 👨‍💻 Autor

**Eros Almeida**

- GitHub: [@ErosAlmeida](https://github.com/ErosAlmeida)

---


Desenvolvido com ☕ Java e dedicação aos estudos de programação.


