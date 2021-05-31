package main.java.java9.method_or_in_optional;

import java.util.Optional;

public class SolarSystem {
    public static void main(String[] args) {
        Optional<String> star = Optional.ofNullable(null);
        System.out.println(star.or(() -> Optional.of("Sun")).get());
    }
}
