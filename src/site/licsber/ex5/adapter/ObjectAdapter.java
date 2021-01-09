package site.licsber.ex5.adapter;

public class ObjectAdapter implements Target {
    private final Light light;
    private final Alarm alarm;

    public ObjectAdapter(Light light, Alarm alarm) {
        this.light = light;
        this.alarm = alarm;
    }

    @Override
    public void blink() {
        light.blink();
    }

    @Override
    public void sound() {
        alarm.sound();
    }
}
