package com.brady.designpatten.bridge;

public class SquareRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("正方形尺子");
    }
}
