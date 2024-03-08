import java.util.*;
class q9{
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
	int min = n1;
	if(min>n2){
		min = n2;
	}
	if(min>n3){
		min = n3;
	}
	if(min>n4){
		min = n4;
	}
	System.out.println("min ="+min);
	}
}