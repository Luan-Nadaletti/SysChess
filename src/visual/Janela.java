package visual;

import javax.swing.JFrame;

public class Janela extends JFrame{

    public Janela() {
        super("SysChess");
        createAndShow();
    }
    
    private void createAndShow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(new Panel());
        this.setSize(600, 600);
        this.setVisible(true);
    }
}
