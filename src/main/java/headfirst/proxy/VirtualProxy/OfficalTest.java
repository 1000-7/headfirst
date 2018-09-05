package headfirst.proxy.VirtualProxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class OfficalTest {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;


    public OfficalTest() throws MalformedURLException {
        HashMap<String,String> cds = new HashMap<>();
        cds.put("七里香","https://y.gtimg.cn/music/photo_new/T002R300x300M000003DFRzD192KKD.jpg?max_age=2592000");
        cds.put("学不会","https://y.gtimg.cn/music/photo_new/T002R300x300M000002PQCmo2azasb.jpg?max_age=2592000");
        cds.put("依然范特西","https://y.gtimg.cn/music/photo_new/T002R300x300M000002jLGWe16Tf1H.jpg?max_age=2592000");
        URL initialUrl = new URL(cds.get("七里香"));
        menuBar = new JMenuBar();
        menu = new JMenu("favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        for (Map.Entry<String,String> cd : cds.entrySet()){
            String name = cd.getKey();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event->{
                try {
                    imageComponent.setIcon(new ImageProxy(new URL(cd.getValue())));
                    frame.repaint();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            });
        }
        Icon icon = new ImageProxy(initialUrl);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            new OfficalTest();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
