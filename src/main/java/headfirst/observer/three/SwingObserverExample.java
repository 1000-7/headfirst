package headfirst.observer.three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample soe = new SwingObserverExample();
        soe.go();
    }

    private void go() {
        System.out.println("x");
        frame = new JFrame("选择");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(1, 1, 6, 0));
        JButton button = new JButton("should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
    }

    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("angel");
        }
    }


    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("devil");
        }
    }
}
