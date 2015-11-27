package com.win16.inject;

import javax.inject.Inject;

/**
 * Created by REXZOU on 2015/11/21.
 */
public class Car {
    private Motor mMotor;
    @Inject
    public Car(Motor motor) {
        mMotor = motor;
    }
}
