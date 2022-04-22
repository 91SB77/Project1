package PKG1;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementPosition {

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
		
		System.out.println("Enter Element what you want to find");
		int p = sc.nextInt();
		findelement(a,p);
		}
   
	public static void findelement(int a [] ,  int element)
	{
		for (int i=0;   i<a.length;  i++)
		{
			if (a[i]==element)
			{
				System.out.println(element   +   " is present at"   +   (i+1)    + " Position");
			}
		}
	}
}
