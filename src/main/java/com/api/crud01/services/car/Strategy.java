package com.api.crud01.services.car;

import com.api.crud01.entities.car.Car;

public interface Strategy {
    Car saveCar(Car car) throws Exception;
}