package site.licsber.ex5.adapter;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Alarm alarm = new Alarm();
        Target target = new ObjectAdapter(light, alarm);
        Car car = new Car(target);
        car.move();
    }
}
