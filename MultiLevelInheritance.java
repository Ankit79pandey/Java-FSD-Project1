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
class Grandclass extends Childclass{
	public void C() {
		System.out.println("GrandChild class");
	}
}
public class MultiLevelInheritance {
public static void main(String args[]) {
	Grandclass obj=new Grandclass();
	obj.A();
	obj.B();
	obj.C();
}
}
