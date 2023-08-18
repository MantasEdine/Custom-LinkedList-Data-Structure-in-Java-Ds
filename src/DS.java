import java.util.Stack;

public class DS {

    public static void main(String[] args) {

        // Interview Questions

        // Topic One : Stack

        // Question01 : Reversed String

        String str = "abcd";
        String str2 = reversedString(str);
        System.out.println(str2);

        // Question02 : Balanced Brackets String

        String str3 = "((<()>))";
        boolean isBalanced = balancedStringBrackets(str3);
        System.out.println(isBalanced ? "Balanced" : "Not balanced");
    }

    public static boolean balancedStringBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '<') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '>') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openingBracket = stack.pop();
                if ((ch == ')' && openingBracket != '(') ||
                    (ch == ']' && openingBracket != '[') ||
                    (ch == '>' && openingBracket != '<')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static String reversedString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversedElements = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedElements.append(stack.pop());
        }

        return reversedElements.toString();
    }
}
