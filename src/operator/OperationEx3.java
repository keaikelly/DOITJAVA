package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value=((num1=num1+10)<10)&&((i=i+2)<10); //and 이므로 i연산은 실행x
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value=((num1=num1+10)>10)||((i=i+2)<10); //or 이므로 i연산 실행x
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		

	}

}
