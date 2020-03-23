public class _11_FizzBuzz {
    public static void main(String[] args) {
        // 3 fizz
        // 5 buzz
        // 5 fizz buzz

        for (int i = 1; i <= 100; i++) {
            boolean fizzOrBuzz = false;
            if (i % 3 == 0) {
                System.out.println("Fizz");
                fizzOrBuzz = true;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                fizzOrBuzz = true;
            }
            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(i);
            }

        }
    }
}
