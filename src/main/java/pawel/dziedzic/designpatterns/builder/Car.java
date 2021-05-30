package pawel.dziedzic.designpatterns.builder;

public class Car {
    private final String brand;
    private final String make;
    private final Enum enumColor;
    private final double fuelConsumption;
    private final int fuelTankCapacity;
    private final Engine engine;
    public static class CarBuilder {
        private String brand;
        private String make;
        private Enum enumColor;
        private double fuelConsumption;
        private int fuelTankCapacity;
        private Engine engine;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder make(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder color(EnumColor.Color color) {
            this.enumColor = color;
            return this;
        }

        public CarBuilder fuelConsumption(double fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public CarBuilder fuelTankCapacity(int fuelTankCapacity) {
            this.fuelTankCapacity = fuelTankCapacity;
            return this;
        }

        public CarBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }
        public Car build() {
            return new Car(brand, make, fuelConsumption, fuelTankCapacity, engine, enumColor);
        }
    }

        private Car(String brand, String make, double fuelConsumption, int fuelTankCapacity, Engine engine, Enum enumColor) {
            this.brand = brand;
            this.make = make;
            this.fuelConsumption = fuelConsumption;
            this.fuelTankCapacity = fuelTankCapacity;
            this.engine = engine;
            this.enumColor =  enumColor;
        }

    @Override
    public String toString() {
        return "Car { " +
                "brand='" + brand + '\'' +
                "make='" + make + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", engine=" + engine.checkEngine() +
                ", enumColor=" + enumColor +
                " }";
    }
}