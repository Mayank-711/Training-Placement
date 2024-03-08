import java.util.*;
class series{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value");
		int n = sc.nextInt();
		System.out.println("Enter x Value");
		int x = sc.nextInt();
		double sum = 1;
		for (int i = 1;i <=n ;++i ) {
			sum = sum + (Math.pow(x,i)/i);
		}
		System.out.println("SUM is :"+sum);
	}
}