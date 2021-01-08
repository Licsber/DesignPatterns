package site.licsber.ex6.decorator;

public class ScrollDecorator extends VisualComponentDecorator {
    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    void display() {
        System.out.print("加一个滚动条, ");
        super.display();
    }
}
