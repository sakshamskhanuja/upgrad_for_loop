public class Main {
    public static void main(String[] args) {
        for (int i = 2000; i <= 3000; i++) {
            // Checks if number is divisible by 8 but not by 6.
            if (i % 8 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}