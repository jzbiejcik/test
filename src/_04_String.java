public class _04_String {

    public static void main(String[] args) {
        //string jest nie zmienny
        String abc = "abc";
        abc = abc + "cde";

        // jak tworzyć stringi
        String str1 = new String();
        String str2 = "";
        String str3 = new String ("");

        // jak laczyc stringi
        String str4 = str1 + "test";
        System.out.println(str4);

        // jak porówynywać
        boolean equals = (str1 == str2); // nie uzywac == z obiektami
        System.out.println("is equal: " + equals);
        equals = (str1.equals(str2));
        System.out.println("is equal: " + equals);

        String upperCase = "hehe";
        String loweCase = "haha";
        equals = upperCase.equalsIgnoreCase(loweCase);
        System.out.println("equals is: " + equals);

        // dlugosc napisu
        System.out.println("ala ma kota".length());

        // sub string
        String str5 = "ala ma kota";
        System.out.println("substring: " + str5.substring(4, 6));

        // zmiana znakow
        String word = "ala ma kota";
        // a -> u
        System.out.println(word.replace('a', 'u'));
        String word2 = word.replaceAll("[a-z]a", "zz");
        String expected = "azz zz kozz";
        System.out.println("is equal: " + (expected.equals(word2)));
        String postcodeRegex = "\\d\\d-\\d\\d\\d"; // d = cyfra
        String postcode = "01-340";
        String notpostcode = "02345B";
        System.out.println("01-340 is postcode: " + postcode.matches(postcodeRegex));
        System.out.println("01-340 is postcode: " + notpostcode.matches(postcodeRegex));

        // jak usunac biale znaki na poczatku i na koncu
        String str6 = "  lol kssk  ";
        System.out.println(str6.trim());

        // jak sprawdzic czy string zawiera lancuch znakow
        String str7 = "ala ma kotaa";
        System.out.println(str7.contains("kota"));

        // wszystkie duze albo male litery
        System.out.println(str7.toUpperCase());
        System.out.println(str7.toLowerCase());

        // jak sprawdzic czy string konczy sie lub zaczyna od danych znakow
        boolean startsWith = "ala ma kota".startsWith("ala");
        System.out.println("starts with: " + startsWith);
        boolean endsWith = "ala ma kota".endsWith("kota");
        System.out.println("ends with: " + endsWith);

        // System.out.println(str7.startsWith("ala"));

        // porownywanie
        int result = "ala ma kota".compareTo("ula ma kota");
        System.out.println("compare is" + result);


    }
}
