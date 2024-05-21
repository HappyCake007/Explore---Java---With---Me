package org.example;

public class Engine {
    public void start(){
        System.out.println("Engine started.");
    }
}

//********************************************************************
class Car{
    private String model;
    private Engine engine;

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine; //created new Engine obj and asign it to engine variable.
    }
    public void start(){
        System.out.println("Car " + model + " started.");
        engine.start();
    }
}
