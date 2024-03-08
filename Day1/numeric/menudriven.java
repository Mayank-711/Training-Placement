import java.util.*;
class Calculator{
	Scanner yo = new Scanner(System.in);
	public void AreaOfCircle(){
		System.out.println("Enter Radius:");
		int r = yo.nextInt();
		System.out.println("AreaOfCircle is :"+(3.14*r*r));
	}
	public void Circumference(){
		System.out.println("Enter Radius:");
		int r1 = yo.nextInt();
		System.out.println("Circumference is :"+(2*3.14*r1));
	}
	public void AreaofRectangle(){
		System.out.println("Enter length:");
		int l = yo.nextInt();
		System.out.println("Enter Breadth:");
		int b = yo.nextInt();
		System.out.println("AreaofRectangle is :"+(l*b));
	}
	public void VolumeofSphere(){
		System.out.println("Enter Radius:");
		int r2 = yo.nextInt();
		System.out.println("VolumeofSphere  is:"+(3.14*r2*r2*r2*1.333333));
	}
	public void SurfaceAreaOfSphere(){
		System.out.println("Enter Radius:");
		int r3 = yo.nextInt();
		System.out.println("SurfaceAreaOfSphere is :"+(3.14*r3*r3*4));
	}
	public void AreaofSquare(){
		System.out.println("Enter Side:");
		int s = yo.nextInt();
		System.out.println("AreaofSquare is  :"+(s*s));
	}
	public void AreaofRat(){
		System.out.println("Enter length:");
		int l1 = yo.nextInt();
		System.out.println("Enter Breadth:");
		int b1 = yo.nextInt();
		System.out.println("AreaofRigthAngledTriangle is :"+(l1*b1*0.5));
	}
	public void AreaofEat(){
		System.out.println("Enter Side:");
		int s1 = yo.nextInt();
		System.out.println("AreaofSquare is  :"+(s1*s1*s1));
	}
	public void PerimeterofRect(){
		System.out.println("Enter length:");
		int l1 = yo.nextInt();
		System.out.println("Enter Breadth:");
		int b1 = yo.nextInt();
		System.out.println("PerimeterofRect is :" +(2*l1+2*b1));
	}
	public void SimpleInterest(){
		System.out.println("Principal Amount:");
		int p = yo.nextInt();
		System.out.println("No of Years:");
		int n = yo.nextInt();
		System.out.println("Rate of Interest:");
		int r = yo.nextInt();
		System.out.println("SimpleInterest is :" +((p*n*r)/100));
	}
}
class menudriven{
	public static void main(String[] args) {
		Calculator c = new Calculator();
		while(true){
		System.out.println("1.Area of Circle");
		System.out.println("2.Circumference");
		System.out.println("3.Area of Rectangle");
		System.out.println("4.Volume Of Sphere");
		System.out.println("5.Surface Area of Sphere");
		System.out.println("6.Area of Square");
		System.out.println("7.Area of Right Angled Triangle");
		System.out.println("8.Area of Equilateral Triangle");
		System.out.println("9.Perimeter of Rectangle");
		System.out.println("10.Area of Triangle");
		System.out.println("11.Simple Interest");
		System.out.println("0.Exit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
		case 1: c.AreaOfCircle();
			break;
		case 2: c.Circumference();
			break;
		case 3: c.AreaofRectangle();
			break;
		case 4: c.VolumeofSphere();
			break;
		case 5: c.SurfaceAreaOfSphere();
			break;
		case 6: c.AreaofSquare();
			break;
		case 7: c.AreaofRat();
			break;
		case 8: c.AreaofEat();
			break;
		case 9: c.PerimeterofRect();
			break;
		case 10: c.AreaofRat();
			break;
		case 11: c.SimpleInterest();
			break;
		case 0: System.exit(0);
		}
	}
}
}