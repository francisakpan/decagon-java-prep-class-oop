package com.francis.staff;

public class Car {
    private Engine engine;
    private Lighting lighting;
    public Car(Engine engine){
        this.engine = engine; //Composition -> Car cannot exist without an engine.
        lighting = new Lighting(); // Aggregation -> Car can still work without an head light.
    }
}
