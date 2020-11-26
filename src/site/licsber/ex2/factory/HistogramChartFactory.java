package site.licsber.ex2.factory;

import site.licsber.ex2.product.AbstractChart;
import site.licsber.ex2.product.HistogramChart;

public class HistogramChartFactory implements AbstractFactory {
    @Override
    public AbstractChart factory() {
        return new HistogramChart();
    }
}
