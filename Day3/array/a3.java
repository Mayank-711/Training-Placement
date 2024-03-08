import java.util.*;
class a3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[5];
		System.out.println("Enter Number:");
		for (int i=0;i<5 ;i++ ) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;++i){
			int m = arr1[i];
			if(m%2==0){
				System.out.println(m+ " is Even");
			}
			
			else{
				System.out.println(m+" is Odd");
			}
		}
	}
}