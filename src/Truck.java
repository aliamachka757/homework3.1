public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на " + wheelsCount + " колесах");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

