package main.java.java9.private_methods_in_interface;

public interface Car {

    private int getSpeed() {
        return 1;
    }

    private static void start() {

    }
    default String getInfo() {
        return "Your car have speed : " + getSpeed();
    }
}
