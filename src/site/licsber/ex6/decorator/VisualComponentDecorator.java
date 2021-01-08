package site.licsber.ex6.decorator;

public class VisualComponentDecorator extends VisualComponent {
    private final VisualComponent component;

    public VisualComponentDecorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
