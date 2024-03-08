class q5{
	public static void main(String[] args) {
		int a= 4568;
		int n1 = a%10;
	     a = a/10;
		int n2 = a%10;
		 a = a/10;
		int n3 = a%10;
		 a = a/10;
		int n4 = a%10;
		 a = a/10;
		int ans = n1*1000+n2*100+n3*10+n4*1;
		System.out.println(ans);	
	}
}