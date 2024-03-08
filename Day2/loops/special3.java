class special3{
	public static void main(String[] args) {
		for (int i = 1; i <10000;i++){
		int rem,rev=0;
		int nsave = i;
		while(i>0){
			rem = i%10;
			rev = rev*10+rem;
			i = i/10;
		}
		if(rev ==nsave){
			System.out.println(nsave);
		}
		else {
		}
		}
	}
}