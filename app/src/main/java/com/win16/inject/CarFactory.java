package com.win16.inject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by REXZOU on 2015/11/21.
 */

@Module
public class CarFactory {

    @Provides @Singleton
    Car makeCar() {
        return new Car(new Motor());
    }

    @Provides @Singleton
    Motor makeMotor() {
        return new Motor();
    }
}
