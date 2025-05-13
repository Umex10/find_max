package at.fhj.msd;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        Integer number = max(7, 5);
        String compare = max("apple", "zebra");

        List<Integer> numbers = Arrays.asList(
                12, 45, 3, 67, 89, 23, 89, 34, 12, 5,
                76, 99, 32, 41, 77, 88, 6, 17, 53, 44,
                29, 64, 11, 90, 38, 2, 100, 39, 58, 71,
                13, 97, 6, 18, 33, 84, 42, 91, 19, 73,
                60, 21, 37, 66, 7, 55, 86, 14, 40, 68
        );

        List<Integer> numbers2 = Arrays.asList(1, 2, 4, 4, 1, 2, 3);

        List<Integer> numbers3 = Arrays.asList(
                5, 23, 91, 12, 47, 66, 38, 2, 84, 30,
                78, 44, 55, 7, 90, 16, 41, 99, 13, 61,
                36, 24, 88, 19, 53, 81, 33, 68, 17, 75,
                22, 31, 95, 6, 27, 48, 70, 20, 86, 59,
                1, 64, 9, 49, 58, 87, 4, 28, 11, 34
        );

        List<String> text = Arrays.asList("zebra", "apple");

        List<String> text2 = Arrays.asList(
                "orange", "apple", "kiwi", "mango", "peach", "banana", "grape", "lemon", "cherry",
                "pear", "pineapple", "apricot", "blueberry", "raspberry", "strawberry", "plum", "fig", "watermelon", "date",
                "papaya", "grapefruit", "avocado", "nectarine", "plum", "pomegranate", "coconut", "guava", "dragonfruit", "passionfruit",
                "lime", "persimmon", "mandarin", "tangerine", "cranberry", "blackberry", "boysenberry", "elderberry", "gooseberry", "mulberry"
        );

        Integer maxNumber = max(numbers);
        Integer maxNumber2 = max(numbers2);
        Integer maxNumber3 = max(numbers3);
        String MaxTextCom = max(text);
        String MaxText2Com = max(text2);

        Integer minNumber = min(numbers);
        Integer minNumber2 = min(numbers2);
        Integer minNumber3 = min(numbers3);
        String MinTextCom = min(text);
        String MinText2Com = min(text2);

        System.out.println("Max Values:");
        System.out.println("Max of numbers: " + maxNumber);
        System.out.println("Max of numbers2: " + maxNumber2);
        System.out.println("Max of numbers3: " + maxNumber3);
        System.out.println("Max of text: " + MaxTextCom);
        System.out.println("Max of text2: " + MaxText2Com);

        System.out.println("-----------------");

        System.out.println("Min Values:");
        System.out.println("Min of numbers: " + minNumber);
        System.out.println("Min of numbers2: " + minNumber2);
        System.out.println("Min of numbers3: " + minNumber3);
        System.out.println("Min of text: " + MinTextCom);
        System.out.println("Min of text2: " + MinText2Com);

        System.out.println("-----------------");
        System.out.println("Max Age: ");
        List<Human> humans = Arrays.asList(
                new Human("Alice", 30),
                new Human("Bob", 25),
                new Human("Charlie", 35),
                new Human("Diana", 28),
                new Human("Edward", 40),
                new Human("Fiona", 32),
                new Human("George", 24),
                new Human("Helen", 45),
                new Human("Isaac", 29),
                new Human("Jack", 38),
                new Human("Katherine", 50),
                new Human("Louis", 22),
                new Human("Mona", 36),
                new Human("Nina", 33),
                new Human("Oscar", 26),
                new Human("Paul", 27),
                new Human("Quincy", 31),
                new Human("Rachel", 34),
                new Human("Steve", 42)
        );

        Human maxAge = max(humans);
        Human minAge = min(humans);

        System.out.println(maxAge.toString());
        System.out.println(minAge.toString());

    }

    //? Max and Min Method
    public static <T extends Comparable<T>> T max(T a, T b) {

        if (a.compareTo(b) < 0) {
            return b;
        }
        if (a.compareTo(b) > 0) {
            return a;
        }

        return a;

    }

    public static <T extends Comparable<T>> T min(T a, T b) {

        if (a.compareTo(b) < 0) {
            return a;
        }
        if (a.compareTo(b) > 0) {
            return b;
        }

        return a;
    }

    //? max and min method for Lists
    public static <T extends Comparable<T>> T max(List<T> ls) {

        T maxValue = ls.get(0);

        for (int i = 1; i < ls.size(); i++) {

            T comparedValues = max(maxValue, ls.get(i));

            if (comparedValues.compareTo(maxValue) > 0) {
                maxValue = comparedValues;
            }

        }

        return maxValue;

    }

    public static <T extends Comparable<T>> T min(List<T> ls) {

        T minValue = ls.get(0);

        for (int i = 1; i < ls.size(); i++) {

            T comparedValues = min(minValue, ls.get(i));

            if (comparedValues.compareTo(minValue) < 0) {
                minValue = comparedValues;
            }

        }

        return minValue;

    }

}
