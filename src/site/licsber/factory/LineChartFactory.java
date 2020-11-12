package site.licsber.factory;

import site.licsber.product.AbstractChart;
import site.licsber.product.LineChart;

public class LineChartFactory implements AbstractFactory {
    @Override
    public AbstractChart factory() {
        return new LineChart();
    }
}
