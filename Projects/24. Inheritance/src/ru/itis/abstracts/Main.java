package ru.itis.abstracts;

/**
 * 12.03.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        int array[] = {4, 1, 2, 5, 6, 7, 1, 1, 6, 9};
        NumbersCollection collection
                = new SimpleNumberCollection(array);
        System.out.println(collection.getMax());
        System.out.println(collection.getMin());

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println();
        System.out.println(collection.indexOf(9));
    }
}
