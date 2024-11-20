package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public void startEngine() {
        System.out.println("startEngine");
    }

    public void drive() {
        runEngine(this);
        System.out.println(name + " driving");
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        System.out.println("Class SimpleName: "+ carSkeleton);
    }

}
