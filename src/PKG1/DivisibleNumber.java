package PKG1;

import java.util.Arrays;

public class DivisibleNumber {

	public static void main(String[] args) {
		
		//here we want to print first 10 digit which is divisible by 3 and 5
		
		int [] a = new int [10];
		int j =1;                // we start number from 1
		for (int i =0;   i<a.length;   j++)             //increment value of j
		{
			if(j%3==0  &&    j%5==0)
			{
				a[i]=j;
				i++;                // increment value index
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
