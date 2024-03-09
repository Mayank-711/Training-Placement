import java.util.*;
class  palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = next();
		char ch[] = str.toCharArray();
		String rev = " ";
		for(int i=0;i<=ch.length-1;i++){
			rev = str.charAt(i) + rev;
		}
		if(a.equals(rev)){
			System.out.println("palindrome");
		}
		else{
			String.out.println("no palindrome")
		}
	}
}