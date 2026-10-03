package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s -> %d kWh battery and %d cylinders are ready!%n", getClass().getSimpleName(), batterySize, cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("%s -> battery or gas usage: %.2f km/l%n", getClass().getSimpleName(), avgKmPerLitre);
    }
}
