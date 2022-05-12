package estrutural;

import enums.Cor;

public class Torre extends Peca {
    
    public Torre(){
        
    }

    public Torre(int linha, int coluna, Cor cor, Tabuleiro tabuleiro) {
        super(linha, coluna, cor, tabuleiro);
    }

    @Override
    public boolean validaMovimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
