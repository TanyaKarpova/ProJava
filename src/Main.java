import task2.Form1;
import task2.Form2;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFrame frame = null;

        while (true) {
            System.out.println("Введите номер операции:");
            System.out.println("1 - Показать первую UI форму");
            System.out.println("2 - Показать вторую UI форму");
            System.out.println("Пустая строка - завершение программы");

            String operation = scanner.nextLine().trim();

            closeFrame(frame);
            frame = null;

            if (operation.equals("1")) {
                frame = showForm1();
            } else if (operation.equals("2")) {
                frame = showForm2();
            } else if (operation.equals("")) {
                return;
            } else {
                System.out.println("Пожалуйста, введите один из предложенных вариантов");
            }
        }
    }

    private static JFrame showForm1() {
        JFrame frame = new JFrame("Form1");
        frame.setContentPane(new Form1().getMyPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        return frame;
    }

    private static JFrame showForm2() {
        JFrame frame = new JFrame("Form2");
        frame.setContentPane(new Form2().getMyPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        return frame;
    }

    private static void closeFrame(JFrame frame) {
        JOptionPane.getRootFrame().dispose();
        if (frame != null) {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
}
