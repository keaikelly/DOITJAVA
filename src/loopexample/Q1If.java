package loopexample;

public class Q1If {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		char operator = '+';
		if(operator=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		if(operator=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		if(operator=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		if(operator=='/')
			System.out.println(num1+"/"+num2+"="+(num1/num2));

	}

}
