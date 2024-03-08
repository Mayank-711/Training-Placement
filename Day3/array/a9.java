import java.util.*;
class a9{
	public static void main(String[] args) {
		int arr[] = {45,55,64,31,91};
		int arr1[]= Arrays.copyOf(arr,2);
		System.out.println(Arrays.toString(arr1));
		int arr3[]=new int[10];
		System.arraycopy(arr1,0,arr3,0,2);
		System.out.println(Arrays.toString(arr3));
	}
}