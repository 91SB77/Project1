package PKG1;

import java.util.Arrays;

public class AscendingDescendingArray {

	public static void main(String[] args) {
		
		int a [] = {54 , 98 , 26  , 42 , 3};
		System.out.println(Arrays.toString(a));
		System.out.println("Elements in Array");
		for(int i = 0;  i<a.length;   i++)
		{
			System.out.println("Element "    + (i+1)  + "= " + a[i]);
		}
		//Ascending Order
		for (int i = 0;  i<a.length; i++)
		{
			for(int j = i+1;   j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}
		System.out.println("Ascending order of array is "   + Arrays.toString(a));
		
		
		//descending Order
		for (int i = 0;  i<a.length; i++)
		{
			for(int j = i+1;   j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}
		System.out.println("Ascending order of array is "   + Arrays.toString(a));
		}}
