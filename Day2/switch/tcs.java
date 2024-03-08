import java.util.*;
class tcs{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount:");
		int amt = sc.nextInt();
		System.out.println("Enter Range:");
		int note = sc.nextInt();
		switch(note){
		case 2000:
			int n = amt/2000;
			System.out.println("2000 *"+n);
			amt = amt%2000;
		case 500:
			n = amt/500;
			System.out.println("500 *"+n);
			amt = amt%500;
		case 200:
			n = amt/200;
			System.out.println("200 *"+n);
			amt = amt%200;
		case 100:
			n = amt/100;
			System.out.println("100 *"+n);
			amt = amt%100;
		case 50:
			n = amt/50;
			System.out.println("50 *"+n);
			amt = amt%50;
		case 20:
			n = amt/20;
			System.out.println("20 *"+n);
			amt = amt%20;
		case 10:
			n = amt/10;
			System.out.println("10 *"+n);
			amt = amt%10;
		case 5:
			n = amt/5;
			System.out.println("5 *"+n);
			amt = amt%5;
		case 2:
			n = amt/2;
			System.out.println("2 *"+n);
			amt = amt%2;
		case 1:
			n = amt/1;
			System.out.println("1 *"+n);
			amt = amt%1;
			break;
		default: System.out.println("Pls enter a valid note");	
		}
	}
}