package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.util.Scanner;
/**
 * To check if a string is palindrome or not
 * @author Sanjana Rao
 * @since 15-09-2021
 */
public class CheckPalindrome 
{
	 public static void main(String[] args) 
	 {
	        Dequeue<Character> q = new Dequeue<Character>();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Palindrome Checker");
	        System.out.println("enter the word ");
	        String word =  sc.next();
	        char arr[] = word.toCharArray();
	        for(char ha : arr) 
	        {
	         q.addfront(ha);  
	        }
	       String str = "";
	       for(int i=0;i<arr.length; i++) 
	       {
	           str = str + q.removeFront(); 
	       }
	       if(word.equals(str))
	       {
	           System.out.println(str+" is a palindrome");
	       }
	       else 
	       {
	           System.out.println(str+ " is not a palidrome");
	       }
	       sc.close();
	    }
}
