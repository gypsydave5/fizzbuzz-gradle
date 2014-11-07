public class Fizzbuzz {
    public static String makeFizzbuzz(int number) {
        if (isDivisibleByFifteen(number)) return "FizzBuzz";
        if (isDivisibleByFive(number)) return "Buzz";
        if (isDivisibleByThree(number)) return "Fizz";
        return "2";
    }

    private static boolean isDivisibleBy(int numerator, int denominator) {
        return numerator % denominator == 0;
    }

    private static boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

    private static boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number, 5);
    }

    private static boolean isDivisibleByFifteen(int number) {
        return isDivisibleBy(number, 15);
    }
}
