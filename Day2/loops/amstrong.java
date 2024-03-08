import java.util.*;
class amstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int no,rem,sum=0;
		no = sc.nextInt();
		int nsave = no;
		while(no>0){
			rem = no%10;
			sum = sum+(rem*rem*rem);
			no = no/10;
		}
		if (sum==nsave){
		System.out.println("It is a amstrong number");
       }
       else{
       	System.out.println("It is not amstrong number");
       }
	}
}