package lab1;

import lab2.PowerSet;

import java.util.*;
import java.util.stream.Collectors;

/**
 * SubsetSum Problem: given a set S = {s0, s1,s2, …, sn-1}of positive integers and a
 * non-negative integer k, is there a subset T of S so that the sum of the integers in T equals k?
 * Formulate your own procedure for solving the SubsetSum. Think of it as a Java method
 * subsetsum that accepts input S and k, and outputs a subset T of S with the property that the sum
 * of the elements in T is k if such a T exists, or null if no such T can be found.
 * Examples
 * • If S is [1, 3, 9, 4, 8, 5] and k = 21, return [9,4,8] (since 9 + 4 + 8 = 21)
 * • If S is [1, 3, 9] and k = 5, return null (since no such subset can be found)
 * • If S is [1, 3, 9, 4, 8, 5] and k = 0, return [] (since the sum of the empty set is 0)
 *
 */
public class SubsetSum {

    public static Set subSetSum(Set s, int k){
        List<Set<Integer>> powerSets = PowerSet.powerSet(new ArrayList<>(s));
        for(Set<Integer> set : powerSets){
            int sum = 0;
            for(Integer i : set){
                sum += i;
            }
            if(sum==k) return set;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(SubsetSum.subSetSum(new HashSet<>(Arrays.asList(1,3,9,4,8,5)),21));
        System.out.println(SubsetSum.subSetSum(new HashSet<>(Arrays.asList(1,3,9)),5));
        System.out.println(SubsetSum.subSetSum(new HashSet<>(Arrays.asList(1,3,9,4,8,5)),0));
    }
}
