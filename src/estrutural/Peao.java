package estrutural;

import enums.Cor;

public class Peao extends Peca {
    
    public Peao(){
        
    }

    public Peao(int linha, int coluna, Cor cor, Tabuleiro tabuleiro) {
        super(linha, coluna, cor, tabuleiro);
    }

    @Override
    public boolean validaMovimento() {
        return false;
    }

}
