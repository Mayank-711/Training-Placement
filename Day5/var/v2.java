class v2{
	void m1(char ch,int... n){
		System.out.println(ch);
		for(int a:n){
			System.out.println(""+a);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		v2 v=new v2();
		v.m1('A');
		v.m1('B',10);
		v.m1('C',10,20);
		v.m1('D',10,20,30,40);
	}
}