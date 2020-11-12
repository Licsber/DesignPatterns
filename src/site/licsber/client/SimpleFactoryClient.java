package site.licsber.client;

import site.licsber.factory.SimpleChartFactory;
import site.licsber.product.AbstractChart;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        SimpleChartFactory factory = new SimpleChartFactory();
        AbstractChart chart = factory.factory(SimpleChartFactory.chart.HISTOGRAM.getType());
        chart.draw();
    }
}
