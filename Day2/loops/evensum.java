import java.util.*;
class evensum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no = sc.nextInt();
		int sum = 0;
		for(int i = 1;i <=no;i++){
			if(i%2==0){
				sum = sum +i;
			}
			else{
			}
		}
		System.out.println("SUM is :"+sum);
	}
}
