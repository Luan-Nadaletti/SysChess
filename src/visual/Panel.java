package visual;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Panel extends JPanel {

    private Casa casa;

    private final ActionListener lis = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getSource());
        }
    };

    public Panel() {
        addButton();
        createAndShow();
    }

    private void createAndShow() {
        this.setVisible(true);
    }

    private void addButton() {
        this.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casa = new Casa(i, j);
                casa.addActionListener(lis);
                this.add(casa);
            }
        }
    }
}
