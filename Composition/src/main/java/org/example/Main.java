package org.example;

public class Main {
    public  static void main(String[] args){
       Engine myEngine = new Engine();
       Car myCar = new Car("Toyota",myEngine);
       myCar.start();

    }
}