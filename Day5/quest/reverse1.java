import java.util.*;
class reverse1{
	public static void main(String[] args) {
		String str = "Mayank";
		char ch[] = str.toCharArray();
		String rev = " ";
		for(int i=0;i<=ch.length-1;i++){
			rev = str.charAt(i) + rev;
		}
		System.out.println(rev);
	}
}