package com.brady.designpatten.state;

public interface State {
    void switchToGreen(TrafficLight trafficLight);
    void switchToRed(TrafficLight trafficLight);
    void switchToYellow(TrafficLight trafficLight);
}
