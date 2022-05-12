package visual;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class Panel extends JPanel {

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
                this.add(new Casa(i, j));
            }
        }
    }
}
