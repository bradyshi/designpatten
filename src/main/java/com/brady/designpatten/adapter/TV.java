package com.brady.designpatten.adapter;

public class TV implements DualPin{
    @Override
    public void electrify(int l, int n) {
        System.out.println("火线通电" + l + ",领先通电:" + n);
        System.out.println("电视机开机");
    }
}
