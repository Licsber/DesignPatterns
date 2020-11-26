package site.licsber.ex3.factory;

import site.licsber.ex3.product.Button;
import site.licsber.ex3.product.ComboBox;
import site.licsber.ex3.product.InputBox;

public interface AbstractSkinFactory {
    Button factoryButton();

    InputBox factoryInputBox();

    ComboBox factoryComboBox();
}
