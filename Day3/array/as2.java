import java.util.*;
class as2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[5];
		int rem,count=0;
		int sum=0,no;
		System.out.println("Enter Number:");
		for (int i=0;i<5 ;i++ ) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;++i){
			no = arr1[i];
			while(no>0){
			no = no/10;
			++count;
		}
			no = arr1[i];
			while(no>0){
			rem = no%10;
			sum = (int)sum + (int)Math.pow(rem,count);
			no = no/10;
		}
		System.out.println("Amstrong of Number "+arr1[i]+" = "+sum);
		count=0;
		sum = 0;
		}
	}
}