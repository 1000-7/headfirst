package headfirst.proxy_pattern.VirtualProxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageProxyTestDrive {
    ImageComponent jComponent;

    public static void main(String[] args) throws MalformedURLException {
        new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws MalformedURLException {
        JFrame frame = new JFrame();
        Icon icon = new ImageProxy(new URL("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=705602383,2701428732&fm=26&gp=0.jpg"));
        jComponent = new ImageComponent(icon);
        frame.getContentPane().add(jComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
