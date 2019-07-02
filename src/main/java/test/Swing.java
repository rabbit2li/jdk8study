package test;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Swing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("example");
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void text(JPanel jPanel) {
        JTextField jTextField = new JTextField("密码");
        jTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (jTextField.getText().isEmpty()) {
                    jTextField.setText("密码");
                }
            }
        });
        jPanel.add(jTextField);
    }

}
