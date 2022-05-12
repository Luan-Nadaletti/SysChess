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
            = {new Rei(linha, coluna, cor, tabuleiro),
                new Dama(linha, coluna, cor, tabuleiro),
                new Torre(linha, coluna, cor, tabuleiro),
                new Bispo(linha, coluna, cor, tabuleiro),
                new Cavalo(linha, coluna, cor, tabuleiro),
                new Peao(linha, coluna, cor, tabuleiro)};

    private static final String POSICAO_INICIAL = "torre cavalo bispo dama rei bispo cavalo torre / peao peao peao peao peao peao peao peao / 8 / 8 / 8 / 8"
            + " / PEAO PEAO PEAO PEAO PEAO PEAO PEAO PEAO / TORRE CAVALO BISPO DAMA REI BISPO CAVALO TORRE";

    public final void fenStringToPeca() {
        String[] posicoes = POSICAO_INICIAL.split(" ");

        for (int i = 0; i < posicoes.length; i++) {
            for (int j = 0; j < fenPecas.length; j++) {
                if (posicoes[i].equals(fenPecas[j].getClass().getSimpleName().toLowerCase())) {
                    this.cor = Cor.BRANCA;
                    tabuleiro.setPeca(fenPecas[j]);
                    coluna++;
                } else if (posicoes[i].equals(fenPecas[j].getClass().getSimpleName().toUpperCase())) {
                    this.cor = Cor.NEGRA;
                    tabuleiro.setPeca(fenPecas[j]);
                    coluna++;
                }
            }
            if (posicoes[i].equals("/")) {
                linha++;
            } else if (posicoes[i].equals("8")) {
                System.out.println(posicoes[i]);
                for (int k = 0; k < 8; k++) {
                    tabuleiro.setPeca(null);
                }
            }
        }
    }
}
