import java.util.*;
class chara{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char ch = sc.next().charAt(0);
		switch(ch){
		    case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': 
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Not a Vowel");
		}
	}
}