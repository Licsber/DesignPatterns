package site.licsber.ex3.client;

import site.licsber.ex3.factory.AbstractSkinFactory;
import site.licsber.ex3.factory.SpringSkinFactory;
import site.licsber.ex3.product.Button;
import site.licsber.ex3.product.ComboBox;
import site.licsber.ex3.product.InputBox;

public class Client {
    public static void main(String[] args) {
        AbstractSkinFactory factory = new SpringSkinFactory();
        Button button = factory.factoryButton();
        InputBox inputBox = factory.factoryInputBox();
        ComboBox comboBox = factory.factoryComboBox();
        button.draw();
        inputBox.draw();
        comboBox.draw();
    }
}
