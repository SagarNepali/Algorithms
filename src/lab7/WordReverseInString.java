package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Devise an O(n) algorithm to accomplish this task:
 * Given a none-empty string S of length n, S consists some words separated by spaces.
 * We want to reverse every word in S.
 * For example, given S = “we test coders”, your algorithm is going to return a string
 * with every word in S reversed and separated by spaces. So the result for the above
 * example would be “ew tset sredoc”
 *
 */

public class WordReverseInString {

    /* O(n2) */
    public static String reverseEveryWordInString(String string){

        String [] words = string.split(" ");
        Stack stack = new Stack();
        for(String word: words){
            stack.push(new StringBuilder(word).reverse());
        }
        StringBuilder reversed= new StringBuilder();
        for(int i =0; i< words.length; i++){
            reversed.append(stack.pop()+" ");
        }

        return reversed.toString();
    }

    public static String On(String string){

        char[] chars = string.toCharArray();

        String st ="";
        for(int i =chars.length-1; i >=0 ; i--){
            st += chars[i];
        }
        String [] words = st.split(" ");
        st ="";

        int i=words.length-1;
        for(String word: words){
            st += words[i]+ " ";
            i--;
        }
        return st.trim();
    }

    public static void main(String[] args) {

        System.out.println(reverseEveryWordInString("This is a test"));
        System.out.println(On("This is a test"));
    }

}
