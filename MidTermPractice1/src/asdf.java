public class asdf {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseIntegerDigits(number);

        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseIntegerDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return reversedNumber;
    }
}
