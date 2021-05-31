package main.java.java9.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LanguagesSchool {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Ukrainian");
        languages.add("Belarusian");
        languages.add("English");
        languages.add("Polish");

        languages.stream()
                .takeWhile( n -> n != "English")
                .forEach(a -> System.out.println("You can choice: " + a + " language."));

        languages.stream()
                .dropWhile( n -> n != "English")
                .forEach(System.out::println);

        Stream.iterate(0, i -> i < languages.size(), i -> i + 1)
                .forEach(s -> System.out.println(languages.get(s)));

        Optional<String> bestLanguage = Optional.ofNullable(null);
    }
}
