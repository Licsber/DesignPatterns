package site.licsber.ex6.decorator;

public class BlackBorderDecorator extends VisualComponentDecorator {
    public BlackBorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    void display() {
        System.out.print("加一个黑边框, ");
        super.display();
    }
}
