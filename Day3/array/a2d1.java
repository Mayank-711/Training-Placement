import java.util.*;
class a2d1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[][]= new int[3][3];
		int sum = 0;
		System.out.println("Enter Number:");
		for (int i=0;i<3 ;i++ ) {
			for (int j = 0;j<3 ;j++ ) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr1.length;++i){
			for (int j = 0;j<arr1.length ;j++ ) {
			sum += arr1[i][j];
		}
		}
		System.out.println("Sum ="+sum);
	}
}