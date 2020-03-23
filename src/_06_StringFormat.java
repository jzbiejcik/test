import java.util.Date;

public class _06_StringFormat {
    public static void main(String[] args) {
        // template for displaying string with many variables
        System.out.printf("Hello %s! ur best number is: %d\n", "Kuba", 7); // n = enter

        // float
        System.out.printf("float number is: %,.2f \n", 3333.33333); // 2 miejsca po ,

        // data
        System.out.printf("%1$s %2$ta %2$tb %2$tY", "Today is", new Date());

    }
}
