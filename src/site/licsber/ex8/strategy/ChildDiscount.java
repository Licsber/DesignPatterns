package site.licsber.ex8.strategy;

public class ChildDiscount implements AbstractDiscount {
    @Override
    public double getPrice(double price) {
        System.out.println("儿童票");
        return price >= 20 ? price - 10 : price;
    }
}
