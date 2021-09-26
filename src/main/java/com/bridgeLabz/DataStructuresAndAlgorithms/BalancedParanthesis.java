package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.util.Stack;

public class BalancedParanthesis 
{
	public static void main(String[] args) 
	{
		 String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
	     String result = (checkParanthesis(string)) ? "Balanced" : "Not Balanced";
	     System.out.println(result);
	}
	
	/**
	 * The method checkParanthesis is to check if the parenthesis in a string are balanced or not.
	 * We push open parenthesis “(“ and pop closed parenthesis “)”. 
	 * At the End of the expression if the Stack is Empty then the Arithmetic Expression is Balanced.
	 * @param string is the input string
	 * @return true or false if the stack is empty or not
	 */
	private static boolean checkParanthesis(String string)
	{
		Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++)
        {           
            char c = string.charAt(i);
            if (c == '(')
                stack.push(string.charAt(i));
            else if (c == ')')
                stack.pop();
        }
        return stack.isEmpty();
	}
}
