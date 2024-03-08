import java.util.*;
class po4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n and x:");
		int n = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0,i<=100;i++){
			int ans = Math.pow(4,i);
			if(ans){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		}
		
}}