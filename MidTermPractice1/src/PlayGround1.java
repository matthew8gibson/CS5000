import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlayGround1 {
  public static int x = 5;

  public static void myMethod() {
    int x = 10;
    System.out.println(x);
  }

  public static void main(String[] args) {
    System.out.println(x);
    myMethod();
    String yes = "9";
    double yep = Double.parseDouble(yes);

    System.out.println(yep);

    double myMoney = 10;
    System.out.println(myMoney);

    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);

    System.out.println("Current date and time: " + formattedDateTime);
  }
}
