package com.brady.designpatten.decorator;

public class Lipstick extends Decorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("开始擦口红");
        showable.show();
        System.out.println("结束擦口红");
    }
}
