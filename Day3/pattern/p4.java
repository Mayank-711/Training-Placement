import java.util.*;
class p4{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows:");
	int m = 1;
	int r = sc.nextInt();
	for (int i=1;i<=4 ;i++) {
		System.out.println(" ");
			for (int j = 1;j<=4;j++ ) {
			System.out.print(m+" ");
			++m;
			}
		}	
	}
}