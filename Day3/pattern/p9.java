import java.util.*;
class p9{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows:");
	int r = sc.nextInt();
	int j;
	for (int i=1;i<=r ;i++) {
		if (i%2==0){

		}
		else{
			System.out.println(" ");

		for (int k = 1;k<=r-i;k++ ) {
			System.out.print(" ");
		}
			for (j = 1;j<=i;j++) {
			System.out.print("* ");
			}	
		}	
	}
}
}