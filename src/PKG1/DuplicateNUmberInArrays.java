package PKG1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNUmberInArrays {

	public static void main(String[] args) {
		
		//take input from user 
		Scanner scn = new Scanner (System.in);
        System.out.println("Enter size of an Array");
        int size = scn.nextInt();
        int a [] = new int [size];
        
        //to print the element in array
        for (int i =0;  i<size;  i++)
        {
        	System.out.println("Element "   +   (i+1)   +   " :");
        	a[i]=scn.nextInt();
        }
        System.out.println(Arrays.toString(a));
        
        //find the duplicate number 
        for(int i = 0;  i<a.length-1;   i++)
        {
        	int count =0;
        	for(int j=i+1;  j<a.length;   j++)
        	{
        		if (a[i]==a[j])
        		{
        			count = count +1;
        		}
        	}
        	 System.out.println(a[i]   +   " Repeated "    + count);
        }
    }
}
