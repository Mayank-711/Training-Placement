class t{
	public static void main(String[] args) {
		String str = "help4code";
		System.out.println(str);
		String str1 = new String("help4code");
		System.out.println(str1);
		char[] ch = {'h','e','l','p','4','c','o','d','e'};
		String str3 = new String(ch);
		System.out.println(str3);
		char[] ch1 = {'h','e','l','p','4','c','o','d','e'};
		String str4 = new String(ch1,2,6);
		System.out.println(str4);

	}
}