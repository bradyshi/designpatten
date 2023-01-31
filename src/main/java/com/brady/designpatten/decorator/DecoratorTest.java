package com.brady.designpatten.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Showable showable = new Lipstick(new FoundationMakeup(new Girl()));
        showable.show();
    }
}
