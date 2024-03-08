class s7{
	public static void main(String[] args) {
		String s = "Ashish";
		String s2 = "Prashant";
		boolean b = s.equalsIgnoreCase("ashish");
		System.out.println(b);
		b = s.equalsIgnoreCase("Ashish");
		System.out.println(b);
		boolean c = s.equalsIgnoreCase(s2);
		System.out.println(c);
	}
}