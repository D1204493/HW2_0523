public class ElectricCarFactory extends CarFactory {

  public Car generateCar() {
    String carId = CarIdUtil.generateElectricCarId();
    String engineId = generateEngineId();
    String color = generateColor();
    addProducedCar();              //呼叫addProducedCar的方法，讓numOfCars數量可增加1。
    return new Car(carId, engineId, color);
  }

  public boolean updateCarId(Car car,String carId) {
    if (carId.matches("E[A-Z]{2}-[0-9]{4}")) {
      car.setCarId(carId);
      return true;
    }
    return false;
  }


}
