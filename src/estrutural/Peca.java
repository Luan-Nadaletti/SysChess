package estrutural;

import enums.Cor;

public abstract class Peca {

    public Peca() {

    }

    public Peca(int linha, int coluna, Cor cor, Tabuleiro tabuleiro) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.tabuleiro = tabuleiro;
    }

    protected int linha, coluna;
    Cor cor;
    Tabuleiro tabuleiro;

    public abstract boolean validaMovimento();

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

}
