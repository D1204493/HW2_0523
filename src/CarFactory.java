import java.util.Random;

public class CarFactory {
  private int numOfCars;

  public int getProducedCars() {
    return numOfCars;
  }
  public void addProducedCar(){   //因為numOfCars是private，所以繼承CarFactory的車工廠要叫出numOfCars會出現問題。
    numOfCars++;                  //所以要再用一個public接著計算。
  }

  public Car generateCar() {
    String carId = CarIdUtil.generateCarId();
    String engineId = generateEngineId();
    String color = generateColor();
    addProducedCar();             //呼叫addProducedCar的方法，讓numOfCars數量可增加1。
    return new Car(carId, engineId, color);
  }

  public String generateEngineId() {
    Random random = new Random();
    StringBuilder engineId = new StringBuilder();
    for (int i = 0; i < 8; i++) {   //生成一個8位數
      engineId.append(random.nextInt(10));  //生成一個0到9之間的隨機整數，並添加到StringBuilder中
    }
    return engineId.toString();
  }

  public String generateColor() {
    String[] colors = {"White", "Black", "Blue"};
    Random random = new Random();
    return colors[random.nextInt(colors.length)];  //隨機產生車子顏色
  }

  public boolean updateCarId(Car car,String carId) {  //用boolean，並回傳(return)true/false。
    if (carId.matches("C[A-Z]{2}-[0-9]{4}")) {  //驗證是否符合CarFactory的規定
      car.setCarId(carId);      //符合則把carId放進car
      return true;              //並回傳true
    }
    return false;               //否則回傳false
  }

  public boolean updateColor(Car car, String newColor) {
    if (isValidColor(newColor)) {
      car.setColor(newColor);
      return true;
    }
    return false;
  }

  private boolean isValidColor(String color) {
    String[] validColors = {"White", "Black", "Blue"};
    for (String validColor : validColors) {
      if (validColor.equalsIgnoreCase(color)) { //equalsIgnoreCase 方法比較兩個字串，不區分大小寫
        return true; //如果找到相同的顏色，立即返回 true，表示輸入的顏色是有效的
      }
    }
    return false; //如果循環結束後沒有照到相同的顏色，返回 false，表示輸入的顏色不是有有效的
  }


}


