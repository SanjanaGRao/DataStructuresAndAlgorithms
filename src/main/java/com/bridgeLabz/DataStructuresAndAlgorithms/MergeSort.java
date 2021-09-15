package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.util.Scanner;

/*
 * The class MergeSort sorts the list of strings
 * @author Sanjana Rao
 * @since 15-09-2021
 */
public class MergeSort {
		/*
	    * The method sort is used to perform merge sort operations
	    * @param arr is a string array
	    * @param l is a start index
	    * @param r is a end index
	    * Recursion is used to sort first and second halves
	    * The method merge is called from this function
	    */
	    private static void sort(String[] arr, int l, int r)
	    {
	    	int n = arr.length;
	    	if (l < r)
	        {
	            int m = (l+r)/2;
	            
	            sort(arr, l, m);
	            sort(arr , m+1, r);
	            merge(arr, l, m, r);
	        }
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	    }
	    
	 /*
     * Method merge is used to merge the two subarrays
     * @param arr string array
     * @param l start index
     * @param m middle index
     * @param r end index
     * @param n1 and n2 tells the sizes of two arrays to be merged
     * @param L and R are two temporary string arrays and the for loops are used to copy the data to temp arrays
     * while loop is used to merge the two subarrays.
     * The second and third while loop are used to copy remaining elements of L[] and R[] array, if any.
     */
    private static void merge(String[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        String L[] = new String [n1];
        String R[] = new String [n2];
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j])<=0)
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of array");
	     int size = sc.nextInt();
	     System.out.println("Enter the elements to be entered in an array: ");
	     String[] array = new String[size] ; 
	     for(int i=0;i<array.length;i++) 
	     {
	        array[i] = sc.next();
	     }
	     int l =0;
	     int r = array.length-1;
	     sort(array,l,r);
	     sc.close();
	}
}
