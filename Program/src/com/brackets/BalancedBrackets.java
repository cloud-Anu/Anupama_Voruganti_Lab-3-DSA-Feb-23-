package com.brackets;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it has balanced brackets:");
        String inputString = scanner.nextLine();

        if (hasBalancedBrackets(inputString)) {
            System.out.println("The entered string has balanced brackets");
        } else {
            System.out.println("The entered string does not have balanced brackets");
        }
        scanner.close(); // close the Scanner object to prevent resource leak
    }

    // Check if a string has balanced brackets
    public static boolean hasBalancedBrackets(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
        
    }
    
}
