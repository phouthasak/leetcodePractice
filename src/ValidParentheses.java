import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.trim().length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                // push
                stack.push(currentChar);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    switch (currentChar) {
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                                break;
                            } else {
                                return false;
                            }
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            } else {
                                return false;
                            }
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                                break;
                            } else {
                                return false;
                            }
                        default:
                            return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
