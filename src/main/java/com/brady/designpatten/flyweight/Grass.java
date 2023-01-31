package com.brady.designpatten.flyweight;

public class Grass extends AbstractDrawable{
    public Grass(String image) {
        super(image);
    }

    @Override
    public void draw(int x, int y) {
        super.draw(x, y);
        System.out.println("在位置【" + x + "," + y + "]上绘制图片" + image);
    }
}
