package site.licsber.ex4.builder;

public class Director {
    Panel panel = new Panel();

    public Panel build() {
        return panel;
    }

    public Director button(String text) {
        panel.addButton(text);
        return this;
    }

    public Director label(String text) {
        panel.addLabel(text);
        return this;
    }

    public Director input(String text) {
        panel.addTextField(text);
        return this;
    }
}
