import java.util.*;
class a10{
	public static void main(String[] args) {
		int arr[] = {45,55,64,31,43,34,342,91};
		int newposition = 5;
		int newvalue = 2;
		for (int i = arr.length-1;i> newposition ;i-- ) {
			arr[i]=arr[i-1];
		}
		arr[newposition]=newvalue;
		System.out.println(Arrays.toString(arr));
	}
}