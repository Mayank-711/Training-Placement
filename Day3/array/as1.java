import java.util.*;
class as1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[10];
		int pos[]= new int[10];
		int neg[]= new int[10];
		int n = 0,m = 0;
		System.out.println("Enter Number:");
		for (int i=0;i<10 ;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<10;i++){
			if(arr[i]>0){
				pos[n]=arr[i];
				n++;
			}
			else{
				neg[m]=arr[i];
				m++;
			}
		}
		if(m>n){
			for(int i = 0;i<m;i++){
			System.out.print(pos[i]+ " ");
			System.out.print(neg[i]+ " ");}
		}
		
	else{
			for(int i = 0;i<n;i++){
			System.out.print(pos[i]+ " ");
			System.out.print(neg[i]+ " ");}
		}
	}
}