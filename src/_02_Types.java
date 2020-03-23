public class _02_Types {

    public static void main(String[] args) {

        byte b1 = 127;
        byte b2 = -128;
        b1 = (byte) 128;
        System.out.println("b1 is " + b1);

        short s1 = 32767;
        short s2 = -32768; // 2B

        int i1 = 2147483647;
        int i2 = -2147483648;  // 4B

        long l1 = 923372036854775807L;
        long l2 = -923372036854775808L; // 8B

        float f1 = 0.999999F; // 4B
        System.out.println("f1 is " +f1);

        double d1 = 0.3424234;
        double d2 = 0.3938843D; // 8B

        boolean ok = true;
        boolean notOk = false;
        ok = !false;
        notOk = !true;
        System.out.println("OK: " + ok + ", Not Ok: " + notOk);
        ok = !notOk;
        notOk = !ok;
        System.out.println("ok is " + ok + ", notOk is " +notOk);

        char c1 = 'c';
        char c2 = '%';
        System.out.println(c1 + c2);
        System.out.println(c1 + 0);
        System.out.println("c1 is" +c1);

        long l3;
        l3 = b1;
        l3 = s1;
        l3 = i1;

        d1 = f1;

        //exceptions
        d1 = l3;
        System.out.println("d1 is " + d1);
        f1 = l3;
        f1 = i1;
        System.out.println("f1 is " + f1);

        // reference types
        String word1 = "null";
        System.out.println("word1 = " + word1);
        word1 = "siemanko";
        System.out.println("word1 is " +word1);

    }
}
