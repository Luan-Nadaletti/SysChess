package estrutural;

import enums.Cor;

public class FEN {

    private int linha = 0, coluna = 0;
    private Cor cor;
    private Tabuleiro tabuleiro;

    public FEN(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    private final Peca fenPecas[]
            = {new Rei(),
                new Dama(),
                new Torre(),
                new Bispo(),
                new Cavalo(),
                new Peao()};

    private static final String POSICAO_INICIAL = "tcbdrbct/pppppppp/8/8/8/8/PPPPPPPP/tcbdrbct";

    public final void fenStringToPeca() {
        String[] posicoes = POSICAO_INICIAL.split(" ");

        int index = 0;
        char ch;

        while (index < POSICAO_INICIAL.length()) {
            ch = POSICAO_INICIAL.charAt(index);

            switch (ch) {
                case '/':
                    if (coluna < 8) {
                        throw new IllegalArgumentException("String fen está mal formatada: '/' inesperado encontrado no index: " + index);
                    }
                    break;
                case '8':
                    for (int i = 0; i < 8; i++) {
                        tabuleiro.setPeca(null);
                    }
                    break;
                default:
                    for (Peca fenPeca : fenPecas) {
                        if (ch == fenPeca.getClass().getSimpleName().toLowerCase().charAt(0)) {
                            tabuleiro.setPeca(fenPeca);
                        } else if (ch == fenPeca.getClass().getSimpleName().toUpperCase().charAt(0)) {
                            tabuleiro.setPeca(fenPeca);
                        }
                    }
                    coluna++;
                    break;
            }
            index++;
        }
    }
}
