import java.util.*;
class reverse{
	public static void main(String[] args) {
		int arr[] = {45,55,64,31,43,34,342,91};
		int i ,j;
		for (j = 0,i = arr.length-1;j<i;j++,i-- ) {
			int temp = arr[j];
			arr[j]= arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}