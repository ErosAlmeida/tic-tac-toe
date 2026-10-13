package pontuacao;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class GerenciadorPontuacaoArquivo implements GerenciadorPontuacao{
  
    private static final String ARQUIVO_PONTUACAO = "pontuacao.txt";

    private Map<String, Integer> pontuacaoMap = new HashMap<String, Integer>();

   
    public GerenciadorPontuacaoArquivo() throws PontuacaoException {
        inicializar();
    }

    private void inicializar() throws PontuacaoException {
            File arquivo = new File(ARQUIVO_PONTUACAO);
            if(!arquivo.exists()){
                try {
                    arquivo.createNewFile();
                }catch (IOException e){
                    throw new PontuacaoException(e.getMessage());
                }
            }


        }
    }
