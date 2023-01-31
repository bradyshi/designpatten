package com.brady.designpatten.decorator;

/**
 * 具体的装饰类
 *
 */
public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("开始打粉底");
        showable.show();
        System.out.println("打粉底结束");
    }
}
