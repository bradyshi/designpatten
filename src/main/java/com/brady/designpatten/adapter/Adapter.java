package com.brady.designpatten.adapter;

/**
 * 对象适配器
 */
public class Adapter implements TriplePin{
    private DualPin dualPin;

    public Adapter(DualPin dualPin){
        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPin.electrify(l, n);
    }
}
