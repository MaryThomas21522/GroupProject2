package GroupProject2;

public class NumberOfWords {

    public static void main(String[] args) {

        String words = "Duncan, is good boy!";
        String[] arr = words.split("\\s");
        System.out.println(arr.length);
    }
}

/*
/*
    Count the Number of Words in a String: Write a function to count the number of words in a given string.
    Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
*/

