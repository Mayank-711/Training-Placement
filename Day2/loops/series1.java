import java.util.*;
class series1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value");
		int n = sc.nextInt();
		System.out.println("Enter x Value");
		int x = sc.nextInt();
		double sum = 1;
		int fact = 1;
		for (int i = 1;i <=n ;++i ) {
			int no =i;
			while(no>0){
				fact = fact *no;
				--no; 
			}
			sum = sum + (Math.pow(x,i)/i);
		}
		System.out.println("SUM is :"+sum);
	}
}