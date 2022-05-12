package estrutural;

import java.util.ArrayList;

public class Tabuleiro {

    private final ArrayList<ArrayList<Peca>> pecas = new ArrayList<>();
    private int linhas, colunas;

    public void setPeca(Peca peca) {
        if (pecas.isEmpty()) {
            pecas.add(new ArrayList<Peca>());
        } else if (pecas.get(pecas.size() - 1).size() == 8) {
            pecas.add(new ArrayList<Peca>());
        }

        pecas.get(pecas.size() - 1).add(peca);
    }

    public void printTabuleiro() {
        for (int i = 0; i < pecas.size(); i++) {
            for (int j = 0; j < pecas.get(i).size(); j++) {
                if (pecas.get(i).get(j) == null) {
                    System.out.print("\t|\t");
                } else {
                    System.out.print("\t" + pecas.get(i).get(j).getClass().getSimpleName() + "\t");
                }
            }
            System.out.println("");
        }
    }

    public void printPecas() {
        for (int i = 0; i < pecas.size(); i++) {
            for (int j = 0; j < pecas.get(i).size(); j++) {
                System.out.println(pecas.get(i).get(j));
            }
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

}
