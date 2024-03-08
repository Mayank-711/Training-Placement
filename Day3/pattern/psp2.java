import java.util.*;
class psp2{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows:");
	int r = sc.nextInt();
	for (int i=1;i<=r ;i++) {
		System.out.println(" ");
			for (int j = 1;j<=r;j++ ) {
				if (j==i){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
		}	
	}
}