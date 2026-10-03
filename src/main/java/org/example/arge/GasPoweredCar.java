package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s -> All %d cylinders are fired up, ready!%n", getClass().getSimpleName(), cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("%s -> usage exceeds the average: %.2f km/l%n", getClass().getSimpleName(), avgKmPerLitre);
    }
}
