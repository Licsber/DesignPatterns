package site.licsber.ex6.decorator;

public class Client {
    public static void main(String[] args) {
        VisualComponent component = new BlackBorderDecorator(new Window());
        component.display();
    }
}
