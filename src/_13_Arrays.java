import java.util.Arrays;

public class _13_Arrays {

    public static void main(String[] args) {
        int[] x = new int[10];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;

        System.out.println("element at index 0: " + x[0]);

        int idx = 9;
        if (idx < x.length && idx >= 0) {
            int y = x[idx];
            System.out.println("y is: " + y);
        }
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "=" + x[i]);
        }
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println("sum is" + sum);

        for (int i : x) {
            System.out.println("i = " + i);
        }
        int sum2 = 0;
        for (int i : x) {
            sum2 += i;
        }
        System.out.println("sum2 is:" + sum2);
        int n = 100;
        boolean[] primes = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                continue;
            }
            for (int j = 2 * i; j < n; j += i) {
                primes[j] = true;
                
            }
        }

        }
}
