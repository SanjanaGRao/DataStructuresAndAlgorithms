package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.util.Scanner;
import java.util.Arrays;
/*
 * The class Anagrams helps in detection of Anagrams from two strings
 * @author Sanjana Rao
 * @since 15-09-2021
 */
public class Anagrams 
{
	/*
	 * The method checkAnagram takes in the parameters a and b of type String
	 * @param str1 and @param str2 removes all the white spaces.
	 * @param status is boolean and is used to tell if the two strings are anagrams or not.
	 */
	private static void checkAnagram(String a, String b) 
	{
		String str1 = a.replaceAll("\\s", "");
        String str2 = b.replaceAll("\\s", "");
        boolean status = true;
        if (str1.length() != str2.length())
        {
            status = false;
        }
        else
        {
            char[] arrayStr1 = str1.toLowerCase().toCharArray();
            char[] arrayStr2 = str2.toLowerCase().toCharArray();
            Arrays.sort(arrayStr1);
            Arrays.sort(arrayStr2);
            status = Arrays.equals(arrayStr1, arrayStr2);
        }
        if (status) 
        {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else 
        {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
	}
	
	/*
	 * The main function takes in two string input from the user.
	 * The function checkAnagram is called taking parameters - user input strings.
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings:");
        String a = sc.nextLine();
        String b = sc.nextLine();
        checkAnagram(a,b);
        sc.close();
    }
}
