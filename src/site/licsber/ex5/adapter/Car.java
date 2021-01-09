package site.licsber.ex5.adapter;

public class Car {
    private Target target;

    public Car(Target target) {
        this.target = target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void move() {
        System.out.println("车在移动");
        target.blink();
        target.sound();
    }
}
