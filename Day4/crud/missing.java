import java.util.*;
class missing{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 10;
	int a[]={1,2,4,6,10,7,8,3,5};
	Arrays.sort(a);
	for(int i = 0;i<n-1;i++){
		if (a[i]==i+1){

		}
		else{
			System.out.println(i+1);
		}
	}
}}