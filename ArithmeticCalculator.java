import java.util.Scanner;
public class ArithmeticCalculator {
public static void main(String args[]) {
	int num1,num2;
	char operator;
	float result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of first number");
	num1=sc.nextInt();
	System.out.println("Enter the value of Second number");
	num2=sc.nextInt();

	System.out.println("If you want perform the particular operation press the respective key (+,-,/,*,%)");
	operator=sc.next().charAt(0);
	if(operator=='+') {
		result=num1+num2;
		System.out.println(result);
	}
	else if(operator=='-') {
		result=num1-num2;
		System.out.println(result);
	}
	else if(operator=='/') {
		result=num1/num2;
		System.out.println(result);
	}
	else if(operator=='*') {
		result=num1*num2;
		System.out.println(result);
	}
	else if(operator=='%') {
		result=num1%num2;
		System.out.println(result);
	}
	else
		System.out.println("You are in a wrong direction");
	
}
}
