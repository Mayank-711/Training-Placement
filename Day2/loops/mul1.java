import java.util.*;
class mul1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int mul = 0;
		for (int i = 0;i<n2 ;i++) {
			mul = mul + n1;
		}
		System.out.println("Multiplication value :"+mul);
	}
}