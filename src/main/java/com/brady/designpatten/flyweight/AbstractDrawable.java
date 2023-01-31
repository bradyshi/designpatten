package com.brady.designpatten.flyweight;

public abstract class AbstractDrawable implements Drawable{
    protected String image;

    public AbstractDrawable(String image) {
        this.image = image;
        System.out.println("从系统加载图片：" + image + "，耗时半秒。。。");
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("draw");
    }
}
