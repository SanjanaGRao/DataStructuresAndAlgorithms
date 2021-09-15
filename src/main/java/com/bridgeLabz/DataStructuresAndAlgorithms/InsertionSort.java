package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
/*
 * The class InsertionSort sorts the list of strings
 * @author Sanjana Rao
 * @since 15-09-2021
 */
public class InsertionSort {

	/*
	 * the class insertionSort takes in the parameter stringArray which reads the elements from the file
	 * @param n is used to find the length of the array
	 * @param key is used to compare the order of the array
	 * for loop is used to traverse through the list and sort in ascending order.
	 * Second for loop is used to display the elements after sorting.
	 */
	private static void insertionSort(String[] stringArray) 
	{
		int n = stringArray.length;
        for (int i=1; i<n; i++)
        {
            String key = stringArray[i];
            int j = i-1;
            while (j>=0 && stringArray[j].compareTo(key)>0)
            {
            	stringArray[j+1] = stringArray[j];
                j = j-1;
            }
            stringArray[j+1] = key;
        }
        for(int i=0;i<stringArray.length;i++)
        {
            System.out.print(stringArray[i]+" ");
        }		
	}
	
	/*
	 * The main function has an object of BufferedReader and Scanner class to read the data from the file
	 * The words in a file are comma separated and stored in an array.
	 * The function insertionSort is performed on that array.
	 */
	public static void main(String[] args) throws Exception
	{
		BufferedReader buffereader = new BufferedReader(new FileReader("C:\\Users\\sanjana.rao_ymediala\\eclipse-workspace\\DataStructuresAndAlgorithms\\src\\main\\java\\com\\bridgeLabz\\DataStructuresAndAlgorithms\\binary.txt"));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = buffereader.readLine()) != null) 
        {
          String[] splitArray = line.split(",");
          insertionSort(splitArray);
        }
        sc.close();
        buffereader.close();
	}
}
