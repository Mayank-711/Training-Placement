import java.util.*;
class elseif{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char ch = sc.next().charAt(0);
		if (ch>=65 && ch <=90) System.out.println("UpperCase");
		else if (ch>=97 && ch <=123) System.out.println("LowerCase");
		else if (ch>=48 && ch <=57) System.out.println("Digit");
		else System.out.println("Symbol");
	}
}