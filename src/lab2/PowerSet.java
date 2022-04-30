package lab2;

import java.util.*;

/**
 * Power Set Algorithm. Given a set X, the power set of X, denoted P(X), is the set of
 * all subsets of X. Below, you are given an algorithm for computing the power set of a
 * given set. This algorithm is used in the brute-force solution to the SubsetSum
 * Problem, discussed in the first lecture. Implement this algorithm in a Java method:
 * List powerSet(List X)
 * Use the following pseudo-code to guide development of your code
     * Algorithm: PowerSet(X)
     * Input: A list X of elements
     * Output: A list P consisting of all subsets of X – elements of P are Sets
     * P ← new list
     * S ← new Set //S is the empty set
     * P.add(S) //P is now the set { S }
     * T ← new Set
     * while (!X.isEmpty() ) do
     * f ← X.removeFirst()
     * for each x in P do
     * T ← x U {f} // T is the set containing f & all elements of x
     * P.add(T)
     * return P
 *
 */
public class PowerSet {

    static public List<Set<Integer>> powerSet(List<Integer> list){

        List<Set<Integer>> p= new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        p.add(s);
        Set<Integer> t;

        for(Integer itemInList : list){
            int size = p.size();
            for(int i=0; i < size ;i++){
                t = new HashSet<>();
                t.add(itemInList);
                t.addAll(p.get(i));
                p.add(t);

            }
        }

        return p;
    }

    static public <T> List<Set<T>> genericPowerSet(List<T> list){

        List<Set<T>> p= new ArrayList<>();
        Set<T> s = new HashSet<>();
        p.add(s);
        Set<T> t;

        while(!list.isEmpty()){
            T f = list.remove(0);
            int size = p.size();
            for(int i=0; i < size; i++){
                t = new HashSet<>();
                t.add(f);
                t.addAll(p.get(i));
                p.add(t);
            }
        }

        return p;
    }

    public static void main(String[] args) {

        System.out.println(powerSet(Arrays.asList(new Integer[]{1,2,3})));
        System.out.println(genericPowerSet(Arrays.asList(new Integer[]{1,2,3})));
    }

}
