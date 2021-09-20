package web.model;

public class Car {
    String markCar;
    String modelCar;
    int yearCar;

    public Car(String markCar, String modelCar, int yearCar) {
        this.markCar = markCar;
        this.modelCar = modelCar;
        this.yearCar = yearCar;
    }

    @Override
    public String toString() {
        return ("Car: " + markCar + '\'' + modelCar + '\'' + yearCar + '\'');
    }
}
