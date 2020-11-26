package site.licsber.ex3.factory;

import site.licsber.ex3.product.*;

public class SpringSkinFactory implements AbstractSkinFactory {
    @Override
    public Button factoryButton() {
        return new SpringButton();
    }

    @Override
    public InputBox factoryInputBox() {
        return new SpringInputBox();
    }

    @Override
    public ComboBox factoryComboBox() {
        return new SpringComboBox();
    }
}
