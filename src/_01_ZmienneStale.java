public class _01_ZmienneStale {

    public static void main(String[] args) {

        int var1;
        var1 = 1;
        System.out.println("var1 =" + var1);

        int var2 = 2;
        System.out.println("var2 = " + var2);

        var1 = 2;
        var2 = 1;
        System.out.println("var1: " + var1 + ", var2: " + var2);

        var1 = var2;
        System.out.println("var1: " + var1 + ", var2: " + var2);

        //stala, nie mozna zmienic wartosci
        final int const1 = 1;
        var2 = const1;
        System.out.println("const1 =" + var2);

        final int const2 = var1;
        var1 = 5;
        System.out.println("const2 =" + const2 + "var1 = " + var1);



    }
}
