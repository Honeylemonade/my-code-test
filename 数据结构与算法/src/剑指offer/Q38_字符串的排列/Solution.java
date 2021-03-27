package 剑指offer.Q38_字符串的排列;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/28 21:00
 */
public class Solution {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return arrayList;
        }

        ArrayList<Character> characters = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            characters.add(aChar);
        }
        HashSet<String> stringHashSet = new HashSet<String>(arrayList);
        core("", characters, stringHashSet);
        arrayList = new ArrayList<String>(stringHashSet);
        return arrayList;
    }

    private static void core(String str, ArrayList<Character> characters, HashSet<String> stringHashSet) {
        if (characters.size() != 0) {
            for (int i = 0; i < characters.size(); i++) {
                ArrayList<Character> tempCharacters = (ArrayList<Character>) characters.clone();
                char temp = tempCharacters.get(i);
                tempCharacters.remove(i);
                core(str + temp, (ArrayList<Character>) tempCharacters.clone(), stringHashSet);
            }
        } else {
            stringHashSet.add(str);
        }
    }

    public static void main(String[] args) {
        String str = "aa";
        ArrayList<String> stringArrayList = Permutation(str);
        for (String s : stringArrayList) {
            System.out.println(s);
        }
    }
}
