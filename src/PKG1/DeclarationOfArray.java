package PKG1;

import java.util.Arrays;

public class DeclarationOfArray {

	public static void main(String[] args) {
		
	   //int [] = a;                   //declaration
		int [] a = new int [5];        // initialize
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;                       // if we cannot declare a[3] then it print 0
		//a[4];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);      // it will print 0
		System.out.println("Length of array is "   + a.length);
		System.out.println(Arrays.toString(a));
		System.out.println("********************************************");
		
		//String [] b = new string [4];
		String [] b = {"Velocity" , "is" , "in" , "Katraj"};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println("Length of Array is "   + a.length);
		System.out.println(Arrays.toString(b));
		//in String there is no default value 
		System.out.println("********************************************");
		
		for (int i =0;   i<a.length;   i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("********************************************");
		
		char [] chh = new char[3];
		chh[0] ='#';                   //ch[2] , ch[3] it will take default value as space 
		chh[1]= 'A';
		System.out.println(Arrays.toString(chh));
		System.out.println("*********************************************");
		
		boolean [] B = new boolean [2];
	   B [1] = true;
	   System.out.println(Arrays.toString(B));
	   //here we also cannot give the second value then compiler take the default value as False
		
			}

}
