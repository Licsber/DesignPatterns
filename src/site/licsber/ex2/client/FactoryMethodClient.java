package site.licsber.ex2.client;

import site.licsber.ex2.factory.AbstractFactory;
import site.licsber.ex2.factory.LineChartFactory;
import site.licsber.ex2.product.AbstractChart;

public class FactoryMethodClient {
    public static void main(String[] args) {
        AbstractFactory factory = new LineChartFactory();
        AbstractChart chart = factory.factory();
        chart.draw();
    }
}
