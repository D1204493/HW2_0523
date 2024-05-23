import java.util.Random;

public class CarIdUtil {

  public static String generateLetter() {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char c1 = chars.charAt((int) (Math.random() * 26));  //隨機產生1字元
    String s1 = String.valueOf(c1);  //轉成字串
    return s1;
  }

  public static String generateNumber() {
    double random = Math.random();
    random = random * 10;
    int nam2 = (int) random + 1;
    String name2 = Integer.toString(nam2);  //隨機產生號碼(1碼)
    return name2;
  }

  public static String generateCarId() {
    String num1 = generateLetter();
    String num2 = generateLetter();
    String num3 = generateNumber();
    String num4 = generateNumber();
    String num5 = generateNumber();
    String num6 = generateNumber();
    String carId = "C"+ num1 + num2 + "-" + num3 + num4 + num5 + num6;  //字串合在一起
    return carId;
  }

  public static String generateTaxiId() {
    String num1 = generateLetter();
    String num2 = generateLetter();
    String num3 = generateNumber();
    String num4 = generateNumber();
    String num5 = generateNumber();
    String taxiCarId = "T"+ num1 + num2 + "-" + num3 + num4 + num5; //字串合在一起
    return taxiCarId;
  }

  public static String generateElectricCarId() {
    String num1 = generateLetter();
    String num2 = generateLetter();
    String num3 = generateNumber();
    String num4 = generateNumber();
    String num5 = generateNumber();
    String num6 = generateNumber();
    String ElectricCarId = "E" + num1 + num2 + "-" + num3 + num4 + num5 + num6;
    return ElectricCarId;
  }

  private static boolean isValidCarId(String carId) {
    if (carId.matches("C[A-Z]{2}-[0-9]{4}")) {
      return true;
    }
    return false;
  }

  private static boolean isValidTaxiId(String carId) {
    if (carId.matches("T[A-Z]{2}-[0-9]{3}")) {
      return true;
    }
    return false;
  }

  private static boolean isValidElectricCarId(String carId) {
    if (carId.matches("E[A-Z]{2}-[0-9]{4}")) {
      return true;
    }
    return false;
  }



}
