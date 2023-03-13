package com.guptaji.entity;

public class Car {

    private int id;
    private String carName;
    private String brandName;
    private int noOfGears;
    private int seatingCapacity;

    public Car(int id, String carName, String brandName, int noOfGears, int seatingCapacity) {
        this.id = id;
        this.carName = carName;
        this.brandName = brandName;
        this.noOfGears = noOfGears;
        this.seatingCapacity = seatingCapacity;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
