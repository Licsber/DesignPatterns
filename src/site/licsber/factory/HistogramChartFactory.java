package site.licsber.factory;

import site.licsber.product.AbstractChart;
import site.licsber.product.HistogramChart;

public class HistogramChartFactory implements AbstractFactory {
    @Override
    public AbstractChart factory() {
        return new HistogramChart();
    }
}
