import java.util.*;
class sum{
	public static void difference(int m,int n){
			int yes=0,not=0;
			int og[] = new int[n];
			int div[] = new int[n];
			int ndiv[]= new int[n];
			for (int i = 0;i<n;i++){
				og[i]= i;
			}
			for (int j =0;j<og.length;j++){
				if(og[j]%m==0){
					div[j]= og[j];
				}
				else{
					ndiv[j]= og[j];
				}
			}
			for(int k =0;k<og.length;k++){
				yes = yes + div[k];
				not =not + ndiv[k];
			}
			System.out.println(not-yes);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("Enter values of m and n");
		m = sc.nextInt();
		n = sc.nextInt();
		difference(m,n);

	}

}