import java.util.*;
class loops1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no,rem,rev=0,length = 0;
		no = sc.nextInt();
		while(no>0){
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
			++length;
		}
		System.out.println("Length of no ="+length);
	}
}