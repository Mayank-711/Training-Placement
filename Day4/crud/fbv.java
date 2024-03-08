import java.util.*;
class fbv{
	public static void isbadversion(int n,int bad){
		if (n>=bad){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total version & bad version");
		int n = sc.nextInt();
		int bad = sc.nextInt();
		for(int i=1;i<=n;i++){
			isbadversion(i,bad);
		}
	}
	
}