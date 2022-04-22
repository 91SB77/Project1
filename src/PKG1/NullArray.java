package PKG1;

import java.util.Arrays;

public class NullArray {

	public static void main(String[] args) {
		
		int a [] = new int [0];
		System.out.println(Arrays.toString(a));               //it will print address of variable a
		a[0]=45;                             //ArrayIndexOutOfException
		//we have An zero size of array but we cannot store value in it
		
		
		int [] b = null;
		System.out.println(b);
		a[0]=11;                               //NullPointerException
		System.out.println(b[0]);

	}

}
