package site.licsber.ex2.factory;

import site.licsber.ex2.product.AbstractChart;
import site.licsber.ex2.product.PieChart;

public class PieChartFactory implements AbstractFactory {
    @Override
    public AbstractChart factory() {
        return new PieChart();
    }
}
