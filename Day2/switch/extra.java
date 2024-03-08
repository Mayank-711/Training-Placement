import java.util.*;
class extra{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CostPrice:");
		int cp = sc.nextInt();
		System.out.println("Enter You are student ot not(y/n)");
		char stud = sc.next().charAt(0);
		if(cp >=500){
			if(stud== 'y')
		 {
			double disc = (double)cp*0.1;
			double total = cp - disc;
			System.out.println("CostPrice="+cp+" Discount="+disc+" Final Price ="+total);

		}
		    else {
			double disc = (double)cp*0.05;
			double total = cp - disc;
			System.out.println("CostPrice="+cp+" Discount="+disc+" Final Price ="+total);
		   }
		}
		else {
			if(cp >=500 && stud== 'n'){
			double disc = (double)cp*0.08;
			double total = cp - disc;
			System.out.println("CostPrice="+cp+" Discount="+disc+" Final Price ="+total);

		}
		   else {
			double disc = (double)cp*0.02;
			double total = cp - disc;
			System.out.println("CostPrice="+cp+" Discount="+disc+" Final Price ="+total);
		}
	  }
	}
}