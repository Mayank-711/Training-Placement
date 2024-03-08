import java.util.*;
class fibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number range:");
		int no = sc.nextInt();
		int f0 =0,f1 = 1,f2,n;
		System.out.print(f0 + "\t"+f1);
		for(int i=3;i<=no;++i){
			f2 = f0+ f1;
			System.out.print("\t"+f2);
			f0 = f1;
			f1 = f2;
		}
	}
}