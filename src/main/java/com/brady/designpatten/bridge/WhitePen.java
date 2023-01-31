package com.brady.designpatten.bridge;

public class WhitePen extends Pen{
    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.println("白色笔");
        ruler.regularize();
    }
}
