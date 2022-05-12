package visual;

import estrutural.Peca;
import java.awt.Color;
import javax.swing.JButton;

public final class Casa extends JButton {

    private int linha, coluna;
    private Peca peca;

    public Casa(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        createAndShow(linha, coluna);
    }

    public Casa(int linha, int coluna, Peca peca) {
        this.linha = linha;
        this.coluna = coluna;
        this.peca = peca;
    }

    public void createAndShow(int i, int j) {
        this.setBackground(((i + j)% 2) == 0 ? Color.white : Color.black);
    }

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

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

}
