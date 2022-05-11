package visual;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel extends JPanel {

    public Panel() {
        createAndShow();
    }

    private void createAndShow() {
        this.setPreferredSize(new Dimension(300, 100));
        this.setAlignmentX(SwingConstants.CENTER);
        this.setVisible(true);
    }
}
