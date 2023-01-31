package com.brady.designpatten.bridge;

public class TriangleRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("三角形尺子");
    }
}
