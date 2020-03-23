public class _03_Operators {
    public static void main(String[] args) {
        // operators + - / * %
        byte plus = 122 + 5;
        int plus2 = plus + 20;
        System.out.println(plus2 + plus);
        System.out.println("napis: " + (plus2 + plus));

        int multiply = plus * 10;
        int division = plus / 10;
        System.out.println("multiply: " + multiply);
        System.out.println("division: " + division);
        System.out.println("wynik ostateczny" + multiply + division + ("jazda jazda"));

        // int divideByZero = plus / 0;

        double d1 = 100.0 / 0;
        System.out.println("dzielone przez zero double: " + d1);

        System.out.println(15 /2);
        System.out.println(15 % 7); // reszta z dzielenia

        // skroty
        int x = 4;
        x = x + 4;
        System.out.println("x to: " + x);
        int y = 4;
        y += 4;

        // increment and decrement
        x = 1;
        x = x + 1;
        x = x + 1;

        y = 1;
        y++;
        System.out.println("y: " + y);
        System.out.println("y: " + y++);;
        System.out.println("y: " + ++y);

        int w = 0;
        w --;
        System.out.println("w: " + w);
        System.out.println("w: " + --w);
        System.out.println("w: " + w--);

        // operatory logiczne
        boolean b1 = (3 == 7);
        System.out.println("cos tam:" + b1);
        b1 = (0 != 0); // != = falsz
        System.out.println("b1 is " + b1);

        boolean gt = (5 > 4);
        boolean gte = (5 >= 4);
        boolean lt = (4 < 5);
        boolean lte = (4 <= 5);

        // operatory binarne
        // & - and
        // | - or
        // ^ - xor
        // ~ - negation
        // >>, << - przesuniecia
        int b0 = 1 & 0;
        System.out.println("wynik: " + b0);

    }
}
