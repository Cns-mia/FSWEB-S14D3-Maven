package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s -> %d kWh battery switched on, ready!%n", getClass().getSimpleName(), batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("%s -> usage under the average: %.2f km per charge%n", getClass().getSimpleName(), avgKmPerCharge);
    }
}
