package headfirst.proxy.VirtualProxy;

import javax.swing.*;
import java.awt.*;


public class ImageComponent extends JComponent {
    Icon icon;

    public ImageComponent(Icon icon) {
        super();
        this.icon = icon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);

    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
