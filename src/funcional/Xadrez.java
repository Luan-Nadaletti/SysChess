package funcional;

import estrutural.FEN;
import estrutural.Tabuleiro;

public class Xadrez {

    public static void main(String[] args) {
        //Janela xadrez = new Janela();
        Tabuleiro tabuleiro = new Tabuleiro();
        FEN fen = new FEN(tabuleiro);

        fen.fenStringToPeca();

        tabuleiro.printTabuleiro();
    }

}
