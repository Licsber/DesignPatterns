package site.licsber.ex4.single;

public interface Moon {
    default double getRadius() {
        return 1738;
    }

    default double getDistanceFromEarth() {
        return 363300;
    }
}
