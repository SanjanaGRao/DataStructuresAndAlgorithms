package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.util.Scanner;
/*
 * The class BubbleSort sorts the array of integers
 * @author Sanjana Rao
 * @since 15-09-2021
 */
public class BubbleSort {
	
	/*
	 * The method bubbleSort takes in integer array as a parameter and sorts it.
	 * @param n is the length of the array
	 * @param temp is a temporary variable used to swap
	 * for loops are nested in order to traverse through the array as well as to point to the next element.
	 * It compares two adjacent elements and sees if first element is smaller or not and based on that decision it swaps.
	 * Second for loop is to print the elements.
	 */
	private static void bubbleSort(int[] array)
	{
		int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(array[j-1] > array[j])
                {
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }       
        }
        System.out.println("Elements after doing Bubble Sort: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
	}
	
	/*
	 * The main function has an object of Scanner class to read the input from the user
	 * @param size is used to ask the size of the array from the user
	 * @param array is an array of integer elements defined by the user.
	 * The function bubbleSort is performed on that array.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] array = new int[size] ;       
        for(int i=0;i<array.length;i++) 
        {
            array[i] = sc.nextInt();
        }
        bubbleSort(array);
        sc.close();
	}
}
