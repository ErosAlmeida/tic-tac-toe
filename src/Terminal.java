
public class Terminal {

    public static final String RESET = "\u001B[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String CIANO = "\u001B[36m";
    public static final String AMARELO = "\u001B[33m";
    public static final String NEGRITO = "\u001B[1m";

    public static void limpar() {
        // Funciona em terminais que interpretam ANSI.
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void titulo() {
        System.out.println(CIANO + NEGRITO);
        System.out.println("╔════════════════════════════╗");
        System.out.println("║       JOGO DA VELHA        ║");
        System.out.println("║        TIC-TAC-TOE         ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println(RESET);
    }

    public static void mensagem(String texto) {
        System.out.println(AMARELO + texto + RESET);
    }

    public static void sucesso(String texto) {
        System.out.println(VERDE + NEGRITO + texto + RESET);
    }

    public static void erro(String texto) {
        System.out.println(VERMELHO + texto + RESET);
    }
}
