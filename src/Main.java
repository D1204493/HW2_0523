import java.util.Random;
public class Main {
  public static void main(String[] args) {

    /*
    CarFactory myfactory = new CarFactory();
    Car myCar = myfactory.generateCar();
    System.out.println("CarFactory:");
    System.out.println("CarId: " + myCar.getCarId());
    System.out.println("CarColor: " + myCar.getColor());
    System.out.println("CarEngineId: " + myCar.getEngineId());
    System.out.println(myfactory.updateCarId(myCar,"asdfghjk"));
    System.out.println(myfactory.updateColor(myCar,"Black"));
    System.out.println(myfactory.getProducedCars());
    System.out.println();

    TaxiFactory myTaxifactory = new TaxiFactory();
    Car myTaxi = myTaxifactory.generateCar();
    System.out.println("TaxiFactory:");
    System.out.println("TaxiCarId: " + myTaxi.getCarId());
    System.out.println("TaxiCarColor: " + myTaxi.getColor());
    System.out.println("TaxiCarEngineId: " + myTaxi.getEngineId());
    System.out.println(myTaxifactory.updateCarId(myCar,"asdfghjk"));
    System.out.println(myTaxifactory.getProducedCars());
    System.out.println();

    ElectricCarFactory myEleFactory = new ElectricCarFactory();
    Car myEleCar = myEleFactory.generateCar();
    System.out.println("ElectricCarFactory:");
    System.out.println("EleCarId: " + myEleCar.getCarId());
    System.out.println("EleCarColor: " + myEleCar.getColor());
    System.out.println("EleCarEngineId: " + myEleCar.getEngineId());
    System.out.println(myEleFactory.updateCarId(myCar,"asdfghjk"));
    System.out.println(myEleFactory.updateColor(myCar,"Red"));
    System.out.println(myEleFactory.getProducedCars());
    */

    CarFactory myfactory = new CarFactory();
    Car myCar1 = myfactory.generateCar();
    Car myCar2 = myfactory.generateCar();
    Car myCar3 = myfactory.generateCar();

    TaxiFactory myTaxifactory = new TaxiFactory();
    Car myTaxi1 = myTaxifactory.generateCar();
    Car myTaxi2 = myTaxifactory.generateCar();

    ElectricCarFactory myEleFactory = new ElectricCarFactory();
    Car myEleCar1 = myEleFactory.generateCar();
    Car myEleCar2 = myEleFactory.generateCar();
    Car myEleCar3 = myEleFactory.generateCar();
    Car myEleCar4 = myEleFactory.generateCar();
    Car myEleCar5 = myEleFactory.generateCar();

    Origanization origanization = new Origanization();
    origanization.buyCar(myCar1);
    origanization.buyCar(myCar2);
    origanization.buyCar(myCar3);
    origanization.buyCar(myTaxi1);
    origanization.buyCar(myTaxi2);
    origanization.buyCar(myEleCar1);
    origanization.buyCar(myEleCar2);
    origanization.buyCar(myEleCar3);
    origanization.buyCar(myEleCar4);
    origanization.buyCar(myEleCar5);

    System.out.println("White cars: " + origanization.getNumOfWhiteCars());
    System.out.println("Black cars: " + origanization.getNumOfBlackCars());
    System.out.println("Blue cars: " + origanization.getNumOfBlueCars());
    System.out.println("Yellow cars: " + origanization.getNumOfYellowCars());

  }
}