import java.util.Scanner;

public class McFart {
    public static void main(String[] args) {
        System.out.println("Hello!");

        float num = Float.parseFloat("19");

        System.out.println(num);

        String inpuString = "1jello";
        switch (inpuString) {
            case "value":

                break;
            case "jello":
                System.out.println("this is it!");
                break;

            default:
                System.out.println("default");
                break;
        }
        int countTo = 1;
        for (int i = 1; i <= countTo; ++i) {
            System.out.print(i);
            if (i != countTo) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        int currentCount = countTo;
        while (currentCount < 99) {
            System.out.print(currentCount + " ");
            ++currentCount;
        }

        // let's do a sentinel!
        String stopString = "no";
        String enteredString = "";
        Scanner scan = new Scanner(System.in);
        System.out.println();
        while (!stopString.equalsIgnoreCase(enteredString)) {
            System.out.println("do you want to keep going? (enter no to stop)");
            enteredString = scan.nextLine();
        }
        scan.close();
    }

    public static boolean isEqual(double a, double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }

}
