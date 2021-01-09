package site.licsber.ex8.strategy;

public class DefaultDiscount implements AbstractDiscount {
    @Override
    public double getPrice(double price) {
        System.out.println("不打折");
        return price;
    }
}
