import java.util.*;
class a4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char alph = sc.next().charAt(0);
		if (alph == 'a' |alph == 'e' |alph == 'i' |alph == 'o' |alph == 'u' ) System.out.println("Vowel");
		else System.out.println("Not a Vowel");
	}
}