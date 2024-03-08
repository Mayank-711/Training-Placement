import java.util.*;
class p8{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows:");
	int r = sc.nextInt();
	for (int i=r;i>=1 ;i--) {
		System.out.println(" ");
		for (int k = 1;k<=r-i;k++ ) {
			System.out.print(" ");
		}
			for (int j = 1;j<=i;j++ ) {
			System.out.print("*");
			}
		}	
	}
}