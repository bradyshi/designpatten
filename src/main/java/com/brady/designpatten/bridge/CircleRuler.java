package com.brady.designpatten.bridge;

public class CircleRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("圆形尺子");
    }
}
