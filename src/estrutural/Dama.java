package estrutural;

import enums.Cor;

public class Dama extends Peca {

    public Dama() {

    }

    public Dama(int linha, int coluna, Cor cor, Tabuleiro tabuleiro) {
        super(linha, coluna, cor, tabuleiro);
    }

    @Override
    public boolean validaMovimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
