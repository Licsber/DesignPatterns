package site.licsber.ex8.strategy;

public class VIPDiscount implements AbstractDiscount{
    @Override
    public double getPrice(double price) {
        System.out.println("VIP票");
        System.out.println("获得额外积分");
        return price * 0.5;
    }
}
