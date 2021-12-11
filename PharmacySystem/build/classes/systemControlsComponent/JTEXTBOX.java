package systemControlsComponent;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author Ali
 */
public class JTEXTBOX extends JTextField {

    public JTEXTBOX(int size) {
        super(size);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(new Color(70,130,180));
        g.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 20, 20);
        super.paintComponents(g);
    }

}
