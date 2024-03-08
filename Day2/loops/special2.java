import java.util.*;
class special2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,rem;
		double sum=0;
		int count = 0;

		for (int i = 1;i <=10000;++i){
			no = i;
			count = 0;
			sum =0;
		while(no>0){
			no = no/10;
			++count;
		}
		no =i;
		while(no>0){
			rem = no%10;
			sum = sum + Math.pow(rem,count);
			no = no/10;
			
		}
		if (sum == i){
			System.out.println(i);
		}
		
	}
		
	}
}