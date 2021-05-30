package pawel.dziedzic.designpatterns;

import pawel.dziedzic.designpatterns.builder.Car;
import pawel.dziedzic.designpatterns.builder.DieselEngine;
import pawel.dziedzic.designpatterns.builder.ElectricalEngine;
import pawel.dziedzic.designpatterns.builder.EnumColor;

public class DesignPatternsApplication {

    public static void main(String[] args) {
        Car carDiesel = new Car.CarBuilder()
                .brand("Audi")
                .make("A5")
                .color(EnumColor.Color.BLACK)
                .engine(new DieselEngine())
                .fuelConsumption(120.4)
                .fuelTankCapacity(200)
                .build();
        System.out.println(carDiesel.toString());

        Car carElectrical = new Car.CarBuilder()
                .brand("Electrical")
                .make("E5")
                .color(EnumColor.Color.BLUE)
                .engine(new ElectricalEngine())
                .fuelConsumption(100)
                .fuelTankCapacity(150)
                .build();
        System.out.println(carElectrical.toString());
    }

}