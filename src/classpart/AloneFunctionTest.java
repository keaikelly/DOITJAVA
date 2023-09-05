package classpart;

public class AloneFunctionTest {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int plusresult=plus(num1, num2);
		int minusresult=minus(num1, num2);
		int timesresult=times(num1, num2);
		int divideresult=divide(num1, num2);
		
		System.out.println(plusresult);
		System.out.println(minusresult);
		System.out.println(timesresult);
		System.out.println(divideresult);
		

	}
	public static int plus(int n1, int n2) {
		return n1+n2;
	}
	public static int minus(int n1, int n2) {
		return n1-n2;
	}
	public static int times(int n1, int n2) {
		return n1*n2;
	}
	public static int divide(int n1, int n2) {
		return n1/n2;
	}

}
