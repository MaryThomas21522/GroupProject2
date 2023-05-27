package GroupProject2;

public class ReverseString {
    public static void main(String[] args) {
        String word="Eye";

        StringBuilder reverseStr = new StringBuilder(word);
        System.out.println(reverseStr.reverse().toString());
    }
}

/*
    Reverse a String: Write a function to reverse a given string. For example, given the input "Hello",
    the output should be "olleH".
*/
