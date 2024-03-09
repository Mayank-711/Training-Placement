import java.util.*;
class reduce{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "aabbbbeeeeffgggg";
		char ch[] = s.toCharArray();
		String f = "";
		int count=0;
		int j;
		for(int i=0;i<ch.length;i++){
			char a = ch[i];
			for(j = i;j<ch.length;j++){
			if(a==ch[j]){
				count = count+1;
				++i;
			}
			}
			f = f+a;
			f = f + count;
			count=0;
			--i;
		}
		System.out.println(f);
	}
}