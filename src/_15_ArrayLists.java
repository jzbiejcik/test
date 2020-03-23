import java.util.*;

public class _15_ArrayLists {
    public static void main(String[] args) {
        // generic list
        // default capacity of array list 10
        List<Integer> integers = new ArrayList<>(50);
        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        // literate over elements
        for (Integer i : integers) {
            System.out.println("i = " + i);
        }
        System.out.println("list size: " + integers.size());

        // methods

        boolean containsOne = integers.contains(1);
        System.out.println("cointains one: " + containsOne);

        // check if empty
        boolean empty = integers.isEmpty();
        System.out.println("empty: " + empty);

        // remove element
        integers.remove(1);
        System.out.println("List removed 1:" + integers);
        System.out.println("List size: " + integers.size());

        // remove object
        integers.remove(new Integer(12));
        System.out.println("List removed 12: " + integers);
        System.out.println("List size: " + integers.size());

        // get element at index
        Integer i1 = integers.get(1); // watch out for list size
        System.out.println("i1 is " + i1);

        // update value at given index
        integers.set(17, 55);
        System.out.println("integers: " + integers);

        // add element
        integers.add(15);
        System.out.println("integers: " + integers);

        integers.add(5, 100);
        System.out.println("integers:" + integers);

        // sort elements
        Collections.sort(integers);
        System.out.println("integers: " + integers);

        // task
        List<Integer> numbers = Arrays.asList(8, 3, 4, 19);
        integers.retainAll(numbers);
        System.out.println("xx: " + integers);

        // clear list
        integers.clear();
        System.out.println("empty?: " + integers.isEmpty());
    }
}
