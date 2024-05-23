public class TaxiFactory extends CarFactory {

  public Car generateCar() {
    String carId = CarIdUtil.generateTaxiId();
    String engineId = generateEngineId();
    addProducedCar();
    return new Car(carId, engineId, "Yellow");
  }

  public boolean updateCarId(Car car,String carId) {
    if (carId.matches("T[A-Z]{2}-[0-9]{3}")) {
      car.setCarId(carId);
      return true;
    }
    return false;
  }


}
