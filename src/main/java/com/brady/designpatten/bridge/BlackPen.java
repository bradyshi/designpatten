package com.brady.designpatten.bridge;

public class BlackPen extends Pen{
    public BlackPen(Ruler ruler) {
        super(ruler);
    }
    @Override
    public void draw() {
        System.out.println("黑色笔");
        ruler.regularize();
    }
}
