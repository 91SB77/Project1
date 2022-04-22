package PKG1;

public class SumArrayElement {

	public static void main(String[] args) {

		int a [] = {1 , 8 , 9 , 65 , 12  , 47 , 36};
		int sum = 0;
		
		for(int i =0;   i<a.length;   i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		
	}
}
