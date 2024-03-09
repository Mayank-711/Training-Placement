import java.util.*;
class lt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = sc.next().charAt(0);
		char ch1[] = s.toCharArray();
		char f[] = new char[s.length()];
		for(int i = 0;i<ch1.length;i++){
			if(ch1[i]!=ch){
				char sr = ch1[i];
				f[i] = sr;
			}
			else{

			}
		}
		System.out.println(f);
	}
}