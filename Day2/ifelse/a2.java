import java.util.*;
class a2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 sub marks & gender(f/m):");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		char gender=sc.next().charAt(0);
		int total = n1+n2+n3;
		int per = total/100;
		if (per >=62 && gender == 'f') System.out.println("You can take admisson");
		else System.out.println("You can't take admisson");
	}
}