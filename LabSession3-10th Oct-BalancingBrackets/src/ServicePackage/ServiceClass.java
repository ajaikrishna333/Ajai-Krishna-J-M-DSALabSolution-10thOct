package ServicePackage;

import java.util.Stack;

public class ServiceClass {

    String string;
    Stack<Character> stack = new Stack<>();

    public ServiceClass(String input) {
        this.string = input;
    }

    public boolean process() {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '[') {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                checker(stack,string.charAt(i));
            } else if (string.charAt(i) == '}') {
                checker(stack,string.charAt(i));
            } else if (string.charAt(i) == ']') {
                checker(stack,string.charAt(i));
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void checker(Stack <Character> stack, char ch){
        if (stack.isEmpty()) {
            stack.push(ch);
        } else if (stack.peek() == '(' && ch == ')'){
            stack.pop();
        } else if (stack.peek() == '{' && ch == '}'){
            stack.pop();
        } else if (stack.peek() == '[' && ch == ']'){
            stack.pop();
        }
    }

}
