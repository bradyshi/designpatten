package com.brady.designpatten.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        DualPin dualPin = new TV();
        Adapter adapter = new Adapter(dualPin);
        adapter.electrify(1, 2, -1);

        TVAdapter tvAdapter = new TVAdapter();
        tvAdapter.electrify(2,3,-1);
    }
}
