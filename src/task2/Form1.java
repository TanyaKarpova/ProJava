package task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JTextField textField;
    private JButton button;

    public JPanel getMyPanel() {
        return myPanel;
    }

    private JPanel myPanel;

    public Form1() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField.getText());
            }
        });
    }
}
