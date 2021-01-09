package site.licsber.ex8.strategy;

public class StudentDiscount implements AbstractDiscount{
    @Override
    public double getPrice(double price) {
        System.out.println("学生票");
        return price * 0.8;
    }
}
