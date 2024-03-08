import java.util.*;
class a2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[5];
		int small,largest;
		System.out.println("Enter Number:");
		for (int i=0;i<5 ;i++ ) {
			arr1[i]=sc.nextInt();
		}
		small = arr1[0];
		largest= arr1[0];
		for(int i=0;i<arr1.length;++i){
			if(small > arr1[i]){
				small = arr1[i];
			}
			if(largest < arr1[i]){
				largest = arr1[i];
			}
			else{

			}
		}
		System.out.println("Smallest : "+small+ " largest :"+ largest);
	}
}