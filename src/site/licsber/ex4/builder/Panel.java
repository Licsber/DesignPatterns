package site.licsber.ex4.builder;

import javax.swing.*;

public class Panel extends JPanel {
    public static Director builder() {
        return new Director();
    }

    public void addButton(String text) {
        add(new JButton(text));
    }

    public void addLabel(String text) {
        add(new JLabel(text));
    }

    public void addTextField(String text) {
        add(new JTextField(text));
    }
}
