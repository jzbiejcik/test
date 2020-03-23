public class _10_Loops {
    public static void main(String[] args) {

        int sum = 0;
        while (sum < 100) {
            sum += 10;
        }
        System.out.println("sum is: " + sum);

        sum = 0;
        do {
            sum += 50;
        }   while (sum < 1000);
        System.out.println("sum is: " + sum);

        sum = 0;
        while (true) {
            sum += 10;
            if (sum > 100000) {
                break;
            }
        }
        System.out.println("sum is" + sum);

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");

        }
        int sum1 = 0;
        while (sum1 <= 10) {
            System.out.print(sum1 + ", ");
            sum1++;
        }

        // while factorial
        int n = 10;
        int result = 1;
        int k = 1;
        while (k <= n) {
            result *= k++;
        }
        System.out.println("Factorial is: " + n + "is: " + result);


        result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            }
            System.out.println("Factorial from n=" + n + " is: " + result );

            int n1 = 0;
            int n2 = 1;
            int n3 = 10;
            int count = 20;
            int ii = 10;
        System.out.println(n1 + " " + n2);

        for (ii = 2; ii < count; ++ii) {
            n3 = n1 + n2;
            System.out.println(+ n3);
            n1 = n2;
            n2 = n3;
        }

    }

}
