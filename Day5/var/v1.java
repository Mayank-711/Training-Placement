class v1{
	void m1(int... n){
		System.out.println("Mayank");
	}
	public static void main(String[] args) {
		v1 v=new v1();
		v.m1();
		v.m1(10);
		v.m1(10,20);
		v.m1(10,20,30);
	}
}