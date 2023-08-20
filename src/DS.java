import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DS {
private final static List<Character> leftBracket = Arrays.asList('(','[','<');
private final static List<Character> rightBracket = Arrays.asList(')',']','>');
    public static void main(String[] args) {
   
        // Interview Questions

        // Topic One : Stack

        // Question01 : Reversed String

        // String str = "abcd";
        // String str2 = reversedString(str);
        // System.out.println(str2);

        // Question02 : Balanced Brackets String

        String str3 = "(({{<>}}))[a]{}{{<>}}(())";
        boolean isBalanced = balancedStringBrackets(str3);
        System.out.println(isBalanced ? "Balanced" : "Not balanced");
    }

    // public static boolean balancedStringBrackets(String str) {
    //     Stack<Character> stack = new Stack<>();
    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //         if (ch == '(' || ch == '[' || ch == '<') {
    //             stack.push(ch);
    //         } else if (ch == ')' || ch == ']' || ch == '>') {
    //             if (stack.isEmpty()) {
    //                 return false;
    //             }
    //             char openingBracket = stack.pop();
    //             if ((ch == ')' && openingBracket != '(') ||
    //                 (ch == ']' && openingBracket != '[') ||
    //                 (ch == '>' && openingBracket != '<')) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return stack.isEmpty();
    // }

    public static boolean balancedStringBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(isOpeining(ch)) {
                stack.push(ch);
     }else if(isClosing(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char right = stack.pop();
               if(isMatching(ch, right)){
                return false;
               }
            }
        }
        
        return stack.isEmpty();
    }

   private static boolean isOpeining(char ch){
    
  return leftBracket.contains(ch) ;
   }
   private static boolean isClosing(char ch){
     return rightBracket.contains(ch);
   }


  private static boolean isMatching(char left , char right){
    return leftBracket.indexOf(left) == rightBracket.indexOf(right);

  }



    // public static String reversedString(String str) {
    //     Stack<Character> stack = new Stack<>();
    //     for (int i = 0; i < str.length(); i++) {
    //         stack.push(str.charAt(i));
    //     }

    //     StringBuilder reversedElements = new StringBuilder();
    //     while (!stack.isEmpty()) {
    //         reversedElements.append(stack.pop());
    //     }

    //     return reversedElements.toString();
    // }
}
