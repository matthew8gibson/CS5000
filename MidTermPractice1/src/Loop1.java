public class Loop1 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            System.out.println(i);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(i); // more common solution
        }
    }
}
