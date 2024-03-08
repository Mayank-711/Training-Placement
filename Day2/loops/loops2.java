import java.util.*;
class loops2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no,rem,rev=0,sum = 0;
		no = sc.nextInt();
		while(no>0){
			rem = no%10;
			no = no/10;
			sum = sum + rem;
		}
		System.out.println("sum of no ="+sum);
	}
}