class cs1{
	public static void main(String[] args) {
		int m = 10;
		for (int i=1;i<=5;i++){
			if(i==3){
				continue;
			}
			System.out.print(i+" ");
			if(m==8){
				--m;
			}
			System.out.print(m);
			--m;
			System.out.println();
		}
	}
}