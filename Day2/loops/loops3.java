import java.util.*;
class loops3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no,rem,mul = 1;
		no = sc.nextInt();
		while(no>0){
			rem = no%10;
			no = no/10;
			mul = mul * rem;
		}
		System.out.println("mul of no ="+mul);
	}
}