package com.guptaji.util;

import com.guptaji.entity.Car;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarUtility {

    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1, "Grand Vitara", "Maruti", 6, 5));
        carList.add(new Car(2, "Kushaq", "Skoda", 6, 5));
        carList.add(new Car(3, "Scorpio N", "Mahindra", 6, 7));
    }

    public static Response getCarData(){
        return Response.ok(carList).build();
    }

    public static Response addNewCarData(Car newCarData){
        carList.add(newCarData);
        return Response.ok(carList).build();
    }

    public static Response updateCarData(int id, Car newCarData){
        carList = carList.stream().map(tempCarData -> {
            if (tempCarData.getId() == id){
                return newCarData;
            } else {
                return tempCarData;
            }
        }).collect(Collectors.toList());
        return Response.ok(carList).build();
    }

    public static Response deleteCarData(int id){
        carList = carList
                .stream()
                .filter(tempCarData -> !(tempCarData.getId() == id))
                .collect(Collectors.toList());

        return Response.ok(carList).build();

        // or we can apply below logic as well
        /*
            Optional<Car> carData = carList
                .stream()
                .filter(tempCarData -> tempCarData.getId() == id)
                .findFirst();

        if (carData.isPresent()){
            carList.remove(carData.get());
            return Response.ok(carList).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
         */
    }
}
