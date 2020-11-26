package site.licsber.ex2.factory;

import site.licsber.ex2.product.AbstractChart;
import site.licsber.ex2.product.HistogramChart;
import site.licsber.ex2.product.LineChart;
import site.licsber.ex2.product.PieChart;

public class SimpleChartFactory {
    public enum chart {
        HISTOGRAM(0),
        LINE(1),
        PIE(2);

        private final int typeNum;

        chart(int i) {
            typeNum = i;
        }

        public int getType() {
            return typeNum;
        }
    }

    public AbstractChart factory(int type) {
        if (type == chart.HISTOGRAM.typeNum) {
            return new HistogramChart();
        } else if (type == chart.LINE.typeNum) {
            return new LineChart();
        } else if (type == chart.PIE.typeNum) {
            return new PieChart();
        } else {
            return null;
        }
    }
}
