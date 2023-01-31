package com.brady.designpatten.bridge;

public class BridegeTest {
    public static void main(String[] args) {
        new WhitePen(new CircleRuler()).draw();
        new BlackPen(new SquareRuler()).draw();
    }
}
