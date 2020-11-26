package site.licsber.ex2.factory;

import site.licsber.ex2.product.AbstractChart;
import site.licsber.ex2.product.LineChart;

public class LineChartFactory implements AbstractFactory {
    @Override
    public AbstractChart factory() {
        return new LineChart();
    }
}
