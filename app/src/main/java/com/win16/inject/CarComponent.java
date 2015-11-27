package com.win16.inject;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by REXZOU on 2015/11/27.
 */
@Singleton
@Component(modules = {CarFactory.class})
public interface CarComponent {
        Car provideCar();
}
