package PKG1;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumArray {

	public static void main(String[] args) {

		System.out.println("Take a input from user");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size =s.nextInt();
		int a [] = new int [size];
		
		for(int i =0;  i<a.length;   i++)
		{
			System.out.println("Element"    +   (i+1)    +    ":");
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Unique number are");
		
		for(int i =0;   i<a.length;    i++)
		{
			for (int j =i+1;    j<a.length;   j++)
			{
				if (a[i]==a[j])
				{
					a[i]=0;
				}
			}
			if(a[i] !=0)
			{
				System.out.println(a[i]);
			}
		}
		
		
		
		
		
		
		
	}

}
