package site.licsber.ex4.single;

import javax.swing.*;

public class Client {
    private final JLabel label;

    public Client(String name) {
        JFrame frame = new JFrame(name);
        frame.setSize(300, 200);
        label = new JLabel();
        frame.add(label);
        frame.setVisible(true);
    }

    public void show() {
        Moon moon = MoonStaticInnerClass.getInstance();
        String text = "月球半径" + moon.getRadius();
        text += ", 距地球" + moon.getDistanceFromEarth();
        text += ".";
        label.setText(text);
    }

    public static void main(String[] args) {
        Client client1 = new Client("张三");
        Client client2 = new Client("李四");
        client1.show();
        client2.show();
    }
}
