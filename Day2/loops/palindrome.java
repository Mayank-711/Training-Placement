import java.util.*;
class palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no,rem,rev=0;
		no = sc.nextInt();
		int nsave = no;
		while(no>0){
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
		if(rev ==nsave){
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is Not a palindrome");
		}
	}
}