package javaaaaa;

import java.util.Arrays;

public class samplke12 {
public static void main(String[] args) {
	int[] arr={1,6,4,8,3,5,7};
	for (int i = 0; i < arr.length; i++) {
		
	
	System.out.print(arr[i]+" ");
	}
	Arrays.sort(arr);
	System.out.println("\nassending");
	for (int i = 0; i < arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println("\ndescending");
	for (int i = arr.length-1;i>=0; i--) 
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println("\nbinary search of "+Arrays.binarySearch(arr, 7));
	System.out.println("array length "+arr.length);
}
}
