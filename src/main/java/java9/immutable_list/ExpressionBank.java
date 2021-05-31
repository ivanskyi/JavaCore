package main.java.java9.immutable_list;

import java.util.List;

public class ExpressionBank {
    public static void main(String[] args) {
        List immutableExpressionsPocket = List.of("One", "Two", "Three");
        immutableExpressionsPocket.add("Here we will have UnsupportedOperationException");
        System.out.println(immutableExpressionsPocket);
    }
}
