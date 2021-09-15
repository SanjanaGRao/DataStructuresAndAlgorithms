package com.bridgeLabz.DataStructuresAndAlgorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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

	public static void main(String[] args) throws Exception
	{
		BufferedReader buffereader = new BufferedReader(new FileReader("C:\\Users\\sanjana.rao_ymediala\\eclipse-workspace\\DataStructuresAndAlgorithms\\src\\main\\java\\com\\bridgeLabz\\DataStructuresAndAlgorithms\\binary.txt"));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = buffereader.readLine()) != null) 
        {
          String[] splitArray = line.split(",");
          Arrays.sort(splitArray);
          insertionSort(splitArray);
        }
        sc.close();
        buffereader.close();
	}
}
