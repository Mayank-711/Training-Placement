import java.util.*;
class  anagram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char ch[] = a.toCharArray();
		char ch1[] = b.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		boolean ans = true;
		for(int i = 0;i<ch.length;i++){
			if(ch[i]==ch1[i]){
				ans = true;
			}
			else{
				 ans =false;
			}
		}
		System.out.println(ans);
	}
}