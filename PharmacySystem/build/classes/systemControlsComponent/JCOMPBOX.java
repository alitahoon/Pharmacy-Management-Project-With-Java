package systemControlsComponent;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Ali
 */
public class JCOMPBOX extends JComboBox {

    public JCOMPBOX() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(new Color(114,211,203));
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        super.paintComponents(g);
    }

}
