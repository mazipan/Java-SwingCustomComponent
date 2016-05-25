package swingcustomcomponent.component;

/**
 *
 * @author irfan.maulana
 */
import javax.swing.JButton;

public class TransparentButton extends JButton {

    public TransparentButton() {
        super();
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);

    }

}
