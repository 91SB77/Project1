package PKG1;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {

		int a [] = {54 , 32 , 45 , 65 , 4};
		int  maxNum =a[0];
		for (int i =0;   i<a.length;   i++)
		{
			if(maxNum<a[i])
			{
				maxNum=a[i];
			}
		}
		System.out.println("Maximnum number is "      +   maxNum);
			
			
		
		
		
	}

}
