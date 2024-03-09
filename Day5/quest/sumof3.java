import java.util.*;
class sumof3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char ch[]= a.toCharArray();
		int sum =0;
		boolean ans = true;
		for(int i = 0;i<ch.length;i++){
			sum = sum + (int)ch[i];
		}
		for(int j = 1;j<100;j++){
		if(sum==Math.pow(j,3)){
			ans = true;
		}
		else{
			ans = false;
		}

	}
	System.out.println(ans);
	}
}