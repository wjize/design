package headFirst02.swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wangjize on 2025/6/5.
 */
public class SwingObserverExapmple {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExapmple exapmple = new SwingObserverExapmple();
        exapmple.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Button");
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class AngleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it");
        }
    }
    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it");
        }
    }
}
