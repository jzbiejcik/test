public class _07_Autoboxing {
    public static void main(String[] args) {

        int i = 0;
        // object in
        Integer ii = new Integer(0);

        Integer i2 = 45;

        System.out.println("i = ii: " + (i == ii));

        int k = i + i2;
        System.out.println("k is: " + k);

        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println("equal?? " + (i3 == i4));
        System.out.println("equal?? " + (i3.equals(i4)));

        // types

        Byte b = 0;
        Short s = 127;
        Integer i1 = 1;
        Long l1 = 23L;
        Float f1 = 12.4F;
        Double d1 = 12.44;
        Character c1 = 'w';
        boolean b1 = true;

        //gt lt
        Integer i5 = 5;
        Integer i6 = 6;
        System.out.println("5 > 6" + (i5 > i6));

    }
}
