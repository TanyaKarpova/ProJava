package task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 {

    public Form2() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    showMessage("Спасибо");
                } else if (radioButton2.isSelected()) {
                    showMessage("Рада стараться :)");
                } else if (radioButton3.isSelected()) {
                    showMessage("Это вы потрясающие!!! =)");
                } else {
                    showMessage("Выберите вариант");
                }
            }
        });
    }

    public JPanel getMyPanel() {
        return myPanel;
    }

    private JPanel myPanel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JButton button;
    private ButtonGroup radioButtonGroup;

    private void showMessage(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
