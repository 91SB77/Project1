package PKG1;

import java.util.Arrays;

public class ReplacingElementArray {

	public static void main(String[] args) {

		char ch [] = {'#' , 'A' , '5' , '!'};
		System.out.println("Length of Array is "      + ch.length);
		System.out.println(Arrays.toString(ch));
		ch[1]='O';
		ch[3]='@';
		ch[2]='4';
		System.out.println(Arrays.toString(ch));
		
		//array size is fixed during declaration and instantiation we cannot change the size of array
		//but we can replace it 
		//array is also called as object
}
}
