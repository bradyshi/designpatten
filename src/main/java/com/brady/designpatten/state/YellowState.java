package com.brady.designpatten.state;

public class YellowState implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {

    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {

    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("黄色不能直接变黄了");
    }
}
