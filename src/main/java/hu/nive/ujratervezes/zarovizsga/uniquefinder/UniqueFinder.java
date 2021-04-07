package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {
    public List<Character> uniqueChars(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Baj van");
        }
        Set<Character> result = new LinkedHashSet<>();
        for (Character c : str.toCharArray()) {
            result.add(c);
        }
        List<Character> result1 = new ArrayList<>();
        String result_str="";
        for (Character c : result) {
            result1.add(c);
            result_str=result_str+c;
        }
        //System.out.println(result_str);
        //      System.out.println(result1);
        return result1;
    }
}