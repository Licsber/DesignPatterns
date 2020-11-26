package site.licsber.ex3.factory;

import site.licsber.ex3.product.*;

public class SummerSkinFactory implements AbstractSkinFactory {
    @Override
    public Button factoryButton() {
        return new SummerButton();
    }

    @Override
    public InputBox factoryInputBox() {
        return new SummerInputBox();
    }

    @Override
    public ComboBox factoryComboBox() {
        return new SummerComboBox();
    }
}
