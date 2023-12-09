import java.util.Stack;

public class Exercise5 {
	public static void main(String[] args) {
		System.out.println(isBalanced2("{([])}"));
        System.out.println(isBalanced2("()[]{}"));
        System.out.println(isBalanced2("(]"));
        System.out.println(isBalanced2("[(])"));
		
	}
	
	public static boolean isBalanced2(String parentheses) {
		 Stack<Character> stack = new Stack<>();

	        for (char c : parentheses.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else {
	                if (stack.isEmpty()) {
	                    return false;
	                }

	                char top = stack.pop();

	                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
	                    return false; 
	                }
	            }
	        }

	        return stack.isEmpty(); 
	}

}
