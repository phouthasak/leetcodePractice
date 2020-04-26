import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWord {
    public String[] uncommonFromSentences(String A, String B) {
        String[] sentA = A.split(" ");
        String[] sentB = B.split(" ");
        Map<String, Integer> map = new HashMap();
        List<String> all = new ArrayList();

        for (int i = 0; i < sentA.length; i++) {
            if (map.containsKey(sentA[i])) {
                int count = map.get(sentA[i]).intValue();
                count++;
                map.put(sentA[i], count);
            } else {
                map.put(sentA[i], 1);
            }
        }

        for (int i = 0; i < sentB.length; i++) {
            if (map.containsKey(sentB[i])) {
                int count = map.get(sentB[i]).intValue();
                count++;
                map.put(sentB[i], count);
            } else {
                map.put(sentB[i], 1);
            }
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                all.add(entry.getKey());
            }
        }

        String[] result = new String[all.size()];

        for (int i = 0; i < all.size(); i++) {
            result[i] = all.get(i);
        }

        return result;
    }
}
