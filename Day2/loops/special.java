import java.util.*;
class special{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int no,rem;
		double sum=0;
		no = sc.nextInt();
		int nsave = no;
		int x;
		int count = 0;
		while(no>0){
			rem = no%10;
			no = no/10;
			++count;
		}
		no =nsave;
		while(no>0){
			rem = no%10;
			sum = sum + Math.pow(rem,count);
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