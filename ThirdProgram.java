import java.util.Scanner;

public class ThirdProgram {
	public static void main(String args[]) {
		System.out.println("Who is the prime minister of India?");
		System.out.println("1. Dr. Manmohan Singh\n2. Narendra Modi \n3. Rahul Gandhi\n4. Akhilesh Yadav");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a=sc.nextInt();
		if(a==2) {
			System.out.println("Congrats 🎇🎉✨ You won a reward");
		}
		else {
			System.out.println("Wrong Choice");
		}
}
}