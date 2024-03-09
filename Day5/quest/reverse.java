import java.util.*;
class reverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char rev[] = new char[s.length()];
		for(int i = s.length()-1,j =0;i>=0;i--,j++){
			rev[j] = s.charAt(i);
		}
		System.out.println(Arrays.toString(rev));
	}
}