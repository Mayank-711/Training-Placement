import java.util.*;
class p7{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows:");
	char m = 65;
	int r = sc.nextInt();
	for (int i=1;i<=4 ;i++) {
		System.out.println(" ");
			for (int j = 1;j<=4;j++ ) {
			System.out.print(m);
			++m;
			}
		}	
	}
}