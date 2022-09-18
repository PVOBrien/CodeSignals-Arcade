package TheCore.MirrorLake;

import java.util.HashMap;

public class IsSubstitutionCipher {
    boolean solution(String string1, String string2) {
        HashMap<Character, Character> cipher = new HashMap<>();
        HashMap<Character, Character> backCipher = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            Character ch1 = string1.charAt(i);
            Character ch2 = string2.charAt(i);
            if ((cipher.containsKey(ch1) && cipher.get(ch1) != ch2) ||
                    (backCipher.containsKey(ch2) && backCipher.get(ch2) != ch1)
            ) {
                return false;
            } else {
                cipher.put(ch1, ch2);
                backCipher.put(ch2, ch1);
            }
        }
        return true;
    }

    boolean solution2(String string1, String string2) { // https://app.codesignal.com/arcade/code-arcade/mirror-lake/rNrF4v5etMdFNKD3s/solutions?solutionId=YJuBv9arv9yEgmGuq
        HashMap<String, String> map = new HashMap<>(); // once a letter is assigned, must be used for same
        for (int i = 0; i<string1.length(); i++) {
            String key = string1.substring(i, i+1);
            String val = string2.substring(i, i+1);
            if (!map.containsKey(key)) { // already mapped to a different key
                if (map.containsValue(val)) return false;
                map.put(key, val);
            } else {
                if (!map.get(key).equals(val)) return false;
            }
        }
        return true;
    }
}