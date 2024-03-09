class v3{
	void m1(int... a){
		System.out.println("Variable argument="+a);
	}
	void m1(int a){
		System.out.println("normal argument="+a);
	}
	public static void main(String[] args) {
		v3 v = new v3();
		v.m1(10);
	}
}