import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//lc=387
public class FindUNiqueCharInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int op =0;
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i< s.length(); i++){
            if(map.get(s.charAt(i))==1) op = i;
        }
        return op;
    }
}
