import java.util.List;
import java.util.Stack;

public class KeysAndRoom {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // index represents the room number
        // value represents if we have visited that room
        boolean[] roomTracker = new boolean[rooms.size()];
        roomTracker[0] = true; // base case, we always start in room 0
        Stack<Integer> stack = new Stack(); // tracks which room to go to next
        stack.push(0); // default starts at 0

        // only keep going when we have rooms that we are allowed to go too
        while(!stack.isEmpty()) {
            int node = stack.pop(); // current room number
            for (int key : rooms.get(node)) { // each room can have multiple keys for other room
                if (!roomTracker[key]) {
                    roomTracker[key] = true;
                    stack.push(key);
                }
            }
        }

        for (boolean room : roomTracker) {
            if (!room) return false;
        }

        return true;
    }
}
