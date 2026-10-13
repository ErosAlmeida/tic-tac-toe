import pontuacao.GerenciadorPontuacao;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Tabuleiro tabuleiro = new Tabuleiro();

    private List<Jogador> jogadores = new ArrayList<Jogador>();

    private GerenciadorPontuacao gerenciadorPontuacao;

    public void jogar() throws JogoDaVelhaException{
        System.out.println("=================");
        System.out.println("| JOGO DA VELHA |");
        System.out.println("=================");
        System.out.println();

        // Inicializa o gerenciador de pontuação

    }
}
