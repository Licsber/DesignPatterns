package site.licsber.ex4.builder;

import javax.swing.*;

public class Client {
    private final JFrame frame;

    public Client(Panel panel) {
        frame = new JFrame();
        frame.setSize(300, 200);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void change(Panel panel) {
        frame.setContentPane(panel);
        frame.validate();
    }

    public static void main(String[] args) throws InterruptedException {
        Panel panel = Panel.builder().button("你好").label("再见").input(".").build();
        Client client = new Client(panel);
        Thread.sleep(2000);
        panel = Panel.builder().input("Hello").label("world").button(".").build();
        client.change(panel);
    }
}
