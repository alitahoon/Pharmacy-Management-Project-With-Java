package systemControlsComponent;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Ali
 */
public class JBUTTON extends JButton {

    public JBUTTON() {
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(53,202,189));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        super.paintComponents(g);
    }

}
