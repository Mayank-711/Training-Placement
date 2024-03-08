import java.util.*;
class loops4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no,fact = 1;
		no = sc.nextInt();
		while(no>0){
			fact = fact *no;
			--no;
		}
		System.out.println("Fact of no ="+fact);
	}
}