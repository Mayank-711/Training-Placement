import java.util.*;
class stock{
	public static void main(String[] args) {
		int n = 7;
		int price[]={100,80,60,70,60,75,85};
		int res[]=new int[7];
		res[0]=1;
		for(int i=0;i<7-1;i++) {
			if(price[i+1]>price[i]){
				res[i+1]=2;
			}
			else{
				res[i+1]=1;
			}

		}
		for(int j=0;j<res.length;j++){
			int a = res[j];
			System.out.print((a*a*a )+" ");
		}
	}
}