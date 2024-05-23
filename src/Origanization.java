public class Origanization {
  private int numOfWhiteCars;
  private int numOfBlackCars;
  private int numOfBlueCars;
  private int numOfYellowCars;

  public void buyCar(Car car) {
    if(car.getColor().equalsIgnoreCase("White")) {
      numOfWhiteCars++;
    }
    else if(car.getColor().equalsIgnoreCase("Black")) {
      numOfBlackCars++;
    }
    else if(car.getColor().equalsIgnoreCase("Blue")) {
      numOfBlueCars++;
    }
    else if(car.getColor().equalsIgnoreCase("Yellow")) {
      numOfYellowCars++;
    }
  }

  public int getNumOfWhiteCars() {
    return numOfWhiteCars;
  }

  public int getNumOfBlackCars() {
    return numOfBlackCars;
  }

  public int getNumOfBlueCars() {
    return numOfBlueCars;
  }

  public int getNumOfYellowCars() {
    return numOfYellowCars;
  }


}
