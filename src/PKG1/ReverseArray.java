package PKG1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		System.out.println(" take input from user ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int a [] = new int [size];
		
		for(int i=0;  i<a.length;   i++)
		{
			System.out.println("Element is "   + (i+1)   +  " : " );
			a[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
	for(int i =0; i<a.length/2;   i++)
	{
		int temp=a[(a.length-1)-i];
		a[(a.length-1)-i]=a[i];
		a[i]=temp;
	}
	
	System.out.println("****reverse Array****");
	System.out.println(Arrays.toString(a));
	
	
	
	
	
	
	
	
	
	
	
	}

}
