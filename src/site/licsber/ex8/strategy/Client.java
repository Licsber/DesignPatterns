package site.licsber.ex8.strategy;

public class Client {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        System.out.println(ticket.getPrice());

        ticket.setDiscount(new ChildDiscount());
        System.out.println(ticket.getPrice());

        ticket.setDiscount(new VIPDiscount());
        System.out.println(ticket.getPrice());

        ticket.setDiscount(new StudentDiscount());
        System.out.println(ticket.getPrice());
    }
}
