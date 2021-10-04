public class Main {


    public static void main(String[] args) {
        int n, k, dem;
        for (k = 10; k <= 12; k++) {
            dem = 0;
            for (n = 2; n <= k; n++) {
                if (k % n == 2) {
                    dem++;
                }
                if (dem > 1)
                    System.out.print(k);
            }


        }
    }
}