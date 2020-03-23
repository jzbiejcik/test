import java.util.Arrays;

public class _14_ArraysTask {
    public static void main(String[] args) {

        double [][] prices = new double[10][10];
        prices[0][0] = 2.0;
        prices[1][2] = 3.0;

        for (int i = 0; i < prices[i].length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + "=" + prices[i][j]);
            }
        }
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (i + 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
