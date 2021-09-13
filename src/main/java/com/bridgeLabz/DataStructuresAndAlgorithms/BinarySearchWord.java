package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
/*
 * The class BinarySearchWord searches for a word in a file
 * @author Sanjana Rao
 * @since 13-09-2021
 */
public class BinarySearchWord 
{
	/*
	 * The class binarySearch is used to search for a word and return its position
	 * It takes parameters splitArray, word and length of the file.
	 * while loop is used and iterates until all the words are searched
	 * @param pos is initially initialized to 1000 because if pos is already 0 then it will always return 0.
	 * First, it checks if the word is present in the middle, then it @returns m value
	 * If the @parm word is greater, it ignores the left half and searches right half
	 * If the @param word is smaller, it ignores the right half
	 * 
	 */
	private static int binarySearch(String[] splitArray, String word, int length)
	{
		int l = 0;
		int searchTill = length - 1;
        while (l <= searchTill)
        {
            int m = l + (searchTill - l) / 2;
            int pos = -1000;
            if(word == (splitArray[m]))
            {
            	pos = 0;
            }
            if(pos == 0)
            {
            	return m;
            }
            if(word > (splitArray[m]))
            {
            	 l = m + 1;
            }
            else
            {
            	searchTill = m - 1;
            }
        }
        return -1;
	}
	
	/*
	 * The main function has an object of BufferedReader and Scanner class to read the data from the file
	 * The words in a file are comma separated and stored in an array.
	 * The user is then asked to enter the word he wants to search
	 * The program then returns appropriate message when the message is found or not.
	 * @param word is the user input for the word he wants to search in the file.
	 * @param position gives the position of the word in the file. 
	 */
	public static void main(String[] args) throws Exception 
	{
        BufferedReader buffereader = new BufferedReader(new FileReader("C:\\Users\\sanjana.rao_ymediala\\eclipse-workspace\\DataStructuresAndAlgorithms\\src\\main\\java\\com\\bridgeLabz\\DataStructuresAndAlgorithms\\binary.txt"));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = buffereader.readLine()) != null) 
        {
          String[] splitArray = line.split(",");
          Arrays.sort(splitArray);
          int length = splitArray.length;
          System.out.println("Enter the word you want to search: ");
          String word = sc.nextLine();
          int position = binarySearch(splitArray, word, length);
          if (position == -1)
              System.out.println("Sorry, the word '" + word +"' is not present.");
          else
              System.out.println("The word '"+word+"' is found at position: " + (position+1));
        }
        sc.close();
        buffereader.close();
      }
}
