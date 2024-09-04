public class Main {
    public static void patternReverse(int n) {
        for (int i = n; i >= 1; i--) {//4
            for (int j = i; j >= 1; j--) {//4
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void patternReverse3(int n) {
        for (int i = 0; i < n; i++) {//6
            for (int j = (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}