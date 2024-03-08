import java.util.*;
class a1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 sub marks:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1<= 45| n2<= 45 | n3<= 45) System.out.println("Fail");
		else System.out.println("Pass");
	}
}