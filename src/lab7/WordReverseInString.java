package lab7;

import java.util.ArrayList;
import java.util.Stack;

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
        Stack stack = new Stack();

        for(int i=0;i<chars.length;i++){
            stack.push(chars[i]);
        }
        char [] reversed = new char[chars.length];
        for(int i = chars.length-1; i>=0; i--){
            char ch = (char)stack.pop();
            reversed[i] = ch;
        }
        string = String.valueOf(reversed);
        String returnString = "";
        String []words = string.split("");

        for(int i=0 ; i<words.length; i++){
            returnString += words[words.length-1-i];
        }
        return returnString;
    }

    public static void main(String[] args) {

        System.out.println(reverseEveryWordInString("This is a test"));
        System.out.println(On("This is a test"));
    }

}
