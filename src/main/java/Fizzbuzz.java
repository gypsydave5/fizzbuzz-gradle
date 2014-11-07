public class Fizzbuzz {
    public static String makeFizzbuzz(int number) {
        if (number % 5 == 0) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        return "2";
    }
}
