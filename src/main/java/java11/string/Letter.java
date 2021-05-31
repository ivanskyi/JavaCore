package main.java.java11.string;

public class Letter {
    public static void main(String[] args) {
        String head = "            ";
        String body = "    Dear Oleh. How are you?     ";
        System.out.println("Without all whitespaces: " + body.strip());
        System.out.println("Without first whitespaces: " + body.stripLeading());
        System.out.println("Without end whitespaces: " + body.stripTrailing());
        System.out.println("Are head contain only whitespace? : " + head.isBlank());
        System.out.println("Little song: " + " La ".repeat(5));
    }
}
