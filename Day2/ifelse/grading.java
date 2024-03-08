import java.util.*;
class grading{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 sub marks:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int total = n1+n2+n3+n4;
		int per = total/4;
		if(per >=90) System.out.println("Grade A");
		else if(per >=80) System.out.println("Grade B");
		else if(per >=70) System.out.println("Grade C");
		else if(per >=60) System.out.println("Grade D");
		else if(per >=40) System.out.println("Grade E");
		else System.out.println("Fail");
	}
}