import java.util.*;
class a1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[5];
		int sum = 0;
		System.out.println("Enter Number:");
		for (int i=0;i<5 ;i++ ) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;++i){
			sum += arr1[i];
		}
		System.out.println("Sum ="+sum);
	}
}