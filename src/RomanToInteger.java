import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        char[] value = s.toCharArray();

        for (int i = 0; i < value.length; i++) {
            int v1 = map.get(value[i]);

            if (i + 1 < value.length) {
                int v2 = map.get(value[i + 1]);

                if (v1 >= v2) {
                    result = result + v1;
                } else {
                    result = result + v2 - v1;
                    i++;
                }
            } else {
                result = result + v1;
                i++;
            }
        }
        return result;
    }
}
