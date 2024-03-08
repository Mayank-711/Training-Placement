import java.util.*;
class q8{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("N1=");
	int n1 = sc.nextInt();
	System.out.println("N2=");
	int n2 = sc.nextInt();	
	System.out.println("N3=");
	int n3 = sc.nextInt();	
	System.out.println("N4=");
	int n4 = sc.nextInt();	
	System.out.println("N5=");
	int n5 = sc.nextInt();		
	int max = n1;
	if(max<n2){
		max = n2;
	}
	if(max<n3){
		max = n3;
	}
	if(max<n4){
		max = n4;
	}
	if(max<n5){
		max = n5;
	}
	System.out.println("Max ="+max);
	}
}