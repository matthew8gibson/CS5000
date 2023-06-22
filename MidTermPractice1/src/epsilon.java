public class epsilon {

    public static void main(String[] args) {
        // float epsilon = 0.004f; // 4 tenths of a cent
        // if (Math.abs(Math.round(number) - number) < epsilon) {
        // return String.format("%10.0f", number);
        // } else {
        // return String.format("%10.2f", number);
        // }

        double epsilon = Math.ulp(1.0);
        System.out.println("Epsilon: " + epsilon);

    }

}
