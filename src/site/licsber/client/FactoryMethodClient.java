package site.licsber.client;

import site.licsber.factory.AbstractFactory;
import site.licsber.factory.LineChartFactory;
import site.licsber.product.AbstractChart;

public class FactoryMethodClient {
    public static void main(String[] args) {
        AbstractFactory factory = new LineChartFactory();
        AbstractChart chart = factory.factory();
        chart.draw();
    }
}
