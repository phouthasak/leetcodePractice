import java.util.LinkedList;
import java.util.Queue;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        Queue<Character> queue = new LinkedList<>();

        for (char c : name.toCharArray()) {
            queue.add(c);
        }

        for (char c : typed.toCharArray()) {
            if (queue.peek() != null && queue.peek() == c) queue.poll();
        }

        return queue.isEmpty();
//        time = O(N + T)
//        space = O (N + T)
    }
}
