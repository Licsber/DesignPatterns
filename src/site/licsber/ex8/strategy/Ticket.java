package site.licsber.ex8.strategy;

public class Ticket {
    private final double price;
    private AbstractDiscount discount;

    public Ticket(double price) {
        this.price = price;
    }

    public void setDiscount(AbstractDiscount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        if (discount == null) {
            discount = new DefaultDiscount();
        }
        return discount.getPrice(price);
    }
}
