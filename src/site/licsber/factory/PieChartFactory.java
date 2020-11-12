package site.licsber.factory;

import site.licsber.product.AbstractChart;
import site.licsber.product.PieChart;

public class PieChartFactory implements AbstractFactory {
    @Override
    public AbstractChart factory() {
        return new PieChart();
    }
}
