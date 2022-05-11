package visual;

import java.awt.BorderLayout;
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
        this.getContentPane().add(new Panel(), BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
}
