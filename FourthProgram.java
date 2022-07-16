import java.util.Scanner;
class Parentclass{
	public void A() {
		System.out.println("Parent Class");
	}
}
class Childclass extends Parentclass{
	public void B() {
		System.out.println("Child class");
	}
}
public class FourthProgram {
	public static void main(String args[]) {
	Childclass obj=new Childclass();
	obj.B();
	obj.A();
	
}
}