package com.brady.designpatten.decorator;

/**
 * 抽象类对装饰类进一步抽象，减少每个装饰类都要引入showable对象
 */
public abstract class Decorator implements Showable {
    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
