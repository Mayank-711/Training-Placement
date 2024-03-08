import java.util.*;
class psp1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows:");
	int m = 1;
	int r = sc.nextInt();
	int sum;
	for (int i=1;i<=4 ;i++) {
		System.out.println(" ");
		sum = 0;
			for (int j = 1;j<=4;j++ ) {
			System.out.print(m+" ");
			++m;
			sum = sum +m;
			}
		System.out.println("="+sum);
		sum=0;
		}	
	}
}