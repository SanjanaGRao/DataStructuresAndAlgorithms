package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.util.Scanner;
/*
 * The class PrimeNumber displays prime numbers in a given range.
 * @author Sanjana Rao
 * @since 15-09-2021
 */
public class PrimeNumber {

	/*
	 * The main function prints the prime number in a given range
	 * @param start is for the user to input starting range.
	 * @param end is for the user to input ending range
	 * The main function also checks if the range is between 0 to 1000 and performs appropriate action.
	 * for loop for finding and printing all prime numbers between given range.
	 * @param count and second for loop is used to check is a number is prime or not
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to start : ");
        int start = sc.nextInt();
        System.out.print("Enter the range to end : ");
        int end = sc.nextInt();
        if(start<0 && end >1000) 
        {
        	System.out.println("Range should be within 0-1000.");
        }
        else 
        {
        	System.out.println("\n Prime numbers between "+start+" and "+end+" are : ");
            int count;
            for(int i = start ; i <= end ; i++)
            {
                count = 0;
                for(int j = 1 ; j <= i ; j++)   
                {
                    if(i % j == 0)
                        count = count+1;
                }
                if(count == 2)
                    System.out.print(i+" ");
            }
        }
        sc.close();
	}
}
