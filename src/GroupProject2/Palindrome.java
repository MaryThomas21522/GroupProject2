package GroupProject2;

public class Palindrome {
    public static void main(String[] args) {

        String word = "mom";
        String word2="";

        StringBuilder palindrome=new StringBuilder(word);
        palindrome.reverse();
        word2=palindrome.toString();


        if(word.equals(word2)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is NOT a palindrome");
        }

    }

}

/*
    Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the
    same forwards and backward. For example, "madam" is a palindrome.
 */