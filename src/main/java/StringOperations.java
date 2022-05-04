public class StringOperations {
    public static String reverseString(String stringToReverse) {

        String newString = "";

        // init, block cond, run on each block.
        for (int index = stringToReverse.length() - 1; index >= 0; index--) {
            newString += stringToReverse.charAt(index);
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("-");

        String test0 = reverseString("hi");

        System.out.println(String.format("Result: %s", test0));
    }
}
