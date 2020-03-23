public class _08_ControlFlow {
    public static void main(String[] args) {

        /// widocznosc zmiennych w kodzie
        int k = 0;
        {
            int n = k + 1;
            k++;
            {
                int w = k++;
            }
            System.out.println("k is: " + k);

            // ify
            if (true) {
                System.out.println("prawda");
            }
            if (k > 0) {
                System.out.println("k > 0");
            }
            if (k == 0) {
                System.out.println("k == 0");
            } else {
                System.out.println("k is not 0");
            }
            int w = 0;
            if (k > 0) {
                w = 10;
                System.out.println("k < 0 ");
            } else if (k > 0) {
                w = 20;
                System.out.println("k > 0");
            } else {
                w = 30;
                System.out.println("else");
            }
            // swtich statements
            // switch works with byte short chat int primitive data types
            // also with string and enumerated types

            k = 2;
            switch (k) {
                case 1:
                    System.out.println("k is 1");
                    break;
                case 2:
                    System.out.println("k is 2");
                    break;
                case 3:
                    System.out.println("k is 3");
                    break;
                default:
                    System.out.println("default");

            }

            // switch with string
            String menu = "String";
            String selected = null;

            switch (menu) {
                case "o mnie":
                    System.out.println(" o mnie");
                    selected = "o mnie";
                    break;
                case "Start":
                    System.out.println("start");
                    selected = "start";
                    break;
                default:
                    System.out.println("other menu");
            }

            if (selected == null) {
                selected = "not selected";
            }
                System.out.println("Selected menu: " + selected);

            // break to outer block
            outer:
            {
                int y = 0;
                {
                    int u = y + 1;
                    if (u == 1) {
                        break outer;
                    }
                }
                w = 40;
                System.out.println("w is: " + w);
            }


        }
    }
}
