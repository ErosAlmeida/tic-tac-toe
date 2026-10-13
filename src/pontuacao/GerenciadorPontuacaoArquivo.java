package pontuacao;

import java.io.*;
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
        BufferedReader reader = null;

        try {
            // Utiliza um BufferedReader para ler o arquivo

            reader = new BufferedReader(new FileReader(arquivo));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] tokens = line.split("\\|");


                pontuacaoMap.put(tokens[0].toUpperCase(), Integer.valueOf(tokens[1]));
            }

            } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(reader != null){
                try {
                    reader.close();
                }catch (IOException e){
                    throw new PontuacaoException(e.getMessage());
                }
            }
        }
    }
    public Integer getPontuacao(String nome){
        return pontuacaoMap.get(nome.toUpperCase());
    }

    public void gravarPontuacao(String nome) throws PontuacaoException {
        Integer pontuacao = getPontuacao(nome);

        if (pontuacao == null) {
            pontuacao = 0;
        }
        // Incrementa a pontuação do jogador e recoloca no map
        pontuacaoMap.put(nome.toUpperCase(), pontuacao + 1);

        // Utiliza um BufferedWriter para armazenar as entradas do map no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_PONTUACAO))) {
            for (Map.Entry<String, Integer> entry : pontuacaoMap.entrySet()) {
                // Escreve a linha no arquivo no formato '<nome>|<pontuação>'
                writer.write(entry.getKey() + "|" + entry.getValue());

                // Insere um quebra de linha
                writer.newLine();
            }

        } catch (IOException e) {
            throw new PontuacaoException(e.getMessage());
        }
    }

}
