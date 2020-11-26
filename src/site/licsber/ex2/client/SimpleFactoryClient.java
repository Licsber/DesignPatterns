package site.licsber.ex2.client;

import site.licsber.ex2.factory.SimpleChartFactory;
import site.licsber.ex2.product.AbstractChart;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        SimpleChartFactory factory = new SimpleChartFactory();
        AbstractChart chart = factory.factory(SimpleChartFactory.chart.HISTOGRAM.getType());
        chart.draw();
    }
}
