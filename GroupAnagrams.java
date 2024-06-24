import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> keys = new HashMap<>();
        for(int i=0;i< strs.length;i++) {
            char charArr[] = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            if(keys.containsKey(key)) {
                ArrayList<String> values = keys.get(key);
                values.add(strs[i]);
                keys.put(key, values);
            } else{
                ArrayList<String> values = new ArrayList<>();
                values.add(strs[i]);
                keys.put(key, values);
            }
        }
        List<List<String>> results = new ArrayList<>();
        for(List<String> listOfWords: keys.values()) {
            results.add(listOfWords);
        }

        return results;

    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        String[] str2 = {""};
        System.out.println(groupAnagrams(str2));
        String[] str3 = {"a"};
        System.out.println(groupAnagrams(str3));

    }

}
